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

	public void decrease() {
		// TODO Auto-generated method stub

	}
}
