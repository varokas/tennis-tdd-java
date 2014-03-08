package tennistdd.reloadcountdown;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountdownTest {

    private Countdown countdown;

    @Before
    public void setUp() {
        countdown = new Countdown();
    }

    @Test
    public void initial_state_of_countdown_is_stopped() {
        assertTrue(countdown.stopped());
    }
    
    @Test
    public void countdown_starts() {
        countdown.start(3);
        assertFalse(countdown.stopped());
    }

    @Test
    public void countdown_stopped_after_countdown_period() {
        countdown.start(1);
        countdown.decrease(1);
        assertTrue(countdown.stopped());
    }

    @Test
    public void countdown_stopped_after_period_longer_than_countdown_period() {
        countdown.start(2);
        countdown.decrease(3);
        assertTrue(countdown.stopped());
    }

    @Test
    public void countdown_is_still_counting_after_period_shorter_than_countdown_period(){
        countdown.start(3);
        countdown.decrease(2);
        assertFalse(countdown.stopped());
    }


}
