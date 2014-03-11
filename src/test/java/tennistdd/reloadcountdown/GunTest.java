package tennistdd.reloadcountdown;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

public class GunTest {

    Target target = mock(Target.class);
    ReloadingAnimation animation = mock(ReloadingAnimation.class);
    Gun gun = new Gun(target, animation);

    private static final int SECONDS_FOR_RELOADING = 3;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void gun_can_fire_after_init() {
        gun.fire();

        verify(target).isHit();
    }

    @Test
    public void gun_cannot_fire_again_right_after_fire() {
        gun.fire();
        gun.fire();

        verify(target, times(1)).isHit();
    }

    @Test
    public void start_reloading_after_fire() {
        gun.fire();

        verify(animation).play(any(Countdown.class));
    }

    @Test
    public void gun_can_fire_again_after_reloading() {
        gun.fire();
        decreaseCountdownAfterAnimationPlayed();

        gun.fire();

        verify(target, times(2)).isHit();
    }

    private void decreaseCountdownAfterAnimationPlayed() {
        ArgumentCaptor<Countdown> countdown = ArgumentCaptor.forClass(Countdown.class);
        verify(animation).play(countdown.capture());
        countdown.getValue().decrease(5);
    }

    @Test
    public void gun_cannot_be_fired_during_reload_period() {
        Gun gun = new Gun(SECONDS_FOR_RELOADING);
        gun.fire();
        gun.fire();
        thrown.expectMessage("Failed to fire as the gun is under reloading!");
    }

    @Test
    public void gun_can_be_fired_after_reloading() throws Exception {
        Gun gun = new Gun(SECONDS_FOR_RELOADING);
        gun.fire();
        wait(SECONDS_FOR_RELOADING);
        gun.fire();
    }

    private void wait(int seconds) throws Exception {
        Thread.sleep(seconds * 1000);
    }
}
