package tennistdd.reloadcountdown;

public class Countdown {
    private int secondsRemaining;


    public boolean stopped() {
        return secondsRemaining <= 0;
    }

    public void start(int seconds) {
        this.secondsRemaining = seconds;
    }

    public void decrease(int seconds) {
        this.secondsRemaining -= seconds;
    }
}
