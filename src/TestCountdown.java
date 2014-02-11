import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCountdown {
    
    @Test
    public void an_initialized_countdown_should_be_stopped() {
        Countdown countdown = new Countdown();
        assertTrue(countdown.isStopped());
    }
}
