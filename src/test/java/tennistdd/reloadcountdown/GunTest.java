package tennistdd.reloadcountdown;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GunTest {

    Gun gun = new Gun();

    @Test
    public void gun_can_fire_after_init() {
        assertTrue(gun.canFire());
    }

    @Test
    public void gun_cannot_fire_right_after_fire() {
        gun.fire();

        assertFalse(gun.canFire());
    }
}
