package tennistdd.reloadcountdown;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GunTest {

    @Test
    public void gun_can_fire_after_init() {
        Gun gun = new Gun();
        assertTrue(gun.fire());
    }
}
