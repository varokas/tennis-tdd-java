package tennistdd.java.reloadcountdown;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCountdown {

    private Countdown countdown;

    @Before
    public void setUp() {
        countdown = new Countdown();
    }

    @Test
    public void an_initialized_countdown_should_be_stopped() {
        assertTrue(countdown.isStopped());
    }
    
    @Test
    public void a_started_countdown_should_not_be_stopped() {
        countdown.startCounting(1);
        assertFalse(countdown.isStopped());
    }

    @Test
    public void countdown_decreased_to_zero_should_be_stopped() {
        countdown.startCounting(1);
        countdown.decrease(1);
        assertTrue(countdown.isStopped());
    }

    @Test
    public void countdown_should_be_stopped_after_one_second() {
        countdown.startCounting(1);
        waitForSeconds(1);
        assertTrue(countdown.isStopped());
    }

    private void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
