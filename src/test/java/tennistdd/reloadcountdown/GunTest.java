package tennistdd.reloadcountdown;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GunTest {

    private Gun gun;

    @Before
    public void setUp() {
        gun = new Gun();
    }

    @Test
    public void an_initialized_gun_should_be_loaded() {
        assertTrue(gun.isLoaded());
    }
    
    @Test
    public void a_just_fired_gun_should_not_be_loaded() {
        gun.fire();
        gun.setFiringInterval(1);
        assertFalse(gun.isLoaded());
    }

    @Test
    public void after_a_firing_interval_a_fired_gun_should_be_loaded() {
        gun.fire();
        gun.setFiringInterval(1);
        gun.waitForReloading(1);
        assertTrue(gun.isLoaded());
    }

}
