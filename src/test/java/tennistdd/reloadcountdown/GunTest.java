package tennistdd.reloadcountdown;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GunTest {

    @Test
    public void gun_can_fire_after_init() {
        Target target = mock(Target.class);
        Gun gun = new Gun(target);

        gun.fire();

        verify(target).isHit();
    }

}
