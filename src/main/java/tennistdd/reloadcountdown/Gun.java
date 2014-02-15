package tennistdd.reloadcountdown;

public class Gun {
	private int firingInterval = 0;

	public boolean isLoaded() {
		if (firingInterval > 0)
			return false;
		return true;
	}

	public void setFiringInterval(int seconds) {
		this.firingInterval = seconds;
	}

	public void decrease(int seconds) {
		this.firingInterval -= seconds;

	}

    void waitForReloading(int seconds) {
        try {
            Thread.sleep(seconds);
            decrease(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fire() {
        this.firingInterval = 0;
    }

    public void pullTrigger() {

    }

    public String makeClickingSound() {
        return null;
    }
}
