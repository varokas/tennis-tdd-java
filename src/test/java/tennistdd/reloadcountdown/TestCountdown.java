package tennistdd.reloadcountdown;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCountdown {

    private Gun gun;

    @Before
    public void setUp() {
        gun = new Gun();
    }

    @Test
    public void an_initialized_countdown_should_be_stopped() {
        assertTrue(gun.isStopped());
    }
    
    @Test
    public void a_started_countdown_should_not_be_stopped() {
        gun.startCounting(1);
        assertFalse(gun.isStopped());
    }

    @Test
    public void countdown_decreased_to_zero_should_be_stopped() {
        gun.startCounting(1);
        gun.decrease(1);
        assertTrue(gun.isStopped());
    }

    @Test
    public void countdown_starting_count_from_one_should_be_stopped_after_one_second() {
        gun.startCounting(1);
        gun.waitForSeconds(1);
        assertTrue(gun.isStopped());
    }

}
