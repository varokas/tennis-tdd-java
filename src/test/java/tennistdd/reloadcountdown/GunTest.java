package tennistdd.reloadcountdown;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GunTest {

    Target target = mock(Target.class);
    Gun gun = new Gun(target);

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

}
