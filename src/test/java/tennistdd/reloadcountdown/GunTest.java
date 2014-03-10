package tennistdd.reloadcountdown;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GunTest {

    Target target = mock(Target.class);
    ReloadingAnimation animation = mock(ReloadingAnimation.class);
    Gun gun = new Gun(target, animation);

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
}
