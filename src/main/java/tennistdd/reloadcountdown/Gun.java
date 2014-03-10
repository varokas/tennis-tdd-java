package tennistdd.reloadcountdown;

public class Gun {
    private final Target target;
    private final ReloadingAnimation animation;
    private final Countdown countdown = new Countdown();

    public Gun(Target target, ReloadingAnimation animation) {
        this.target = target;
        this.animation = animation;
    }

    public void fire() {
        if (!countdown.stopped())
            return;

        countdown.start(5);
        this.target.isHit();
        this.animation.play(countdown);
    }
}
