package tennistdd.reloadcountdown;

public class Countdown {
	private int seconds;

	public boolean isStopped() {
		if (seconds > 0)
			return false;
		return true;
	}

	public void startCounting(int seconds) {
		this.seconds = seconds;
	}

	public void decrease(int seconds) {
		this.seconds -= seconds;

	}

    void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds);
            decrease(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
