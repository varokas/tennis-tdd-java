import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCountdown {
    
    @Test
    public void an_initialized_countdown_should_be_stopped() {
        Countdown countdown = new Countdown();
        assertTrue(countdown.isStopped());
    }
    
    @Test
    public void a_started_countdown_should_not_be_stopped() {
        Countdown countdown = new Countdown();
        countdown.startCounting(1);
        assertFalse(countdown.isStopped());
    }
}
