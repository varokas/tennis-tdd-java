package tennistdd.reloadcountdown;

public class Gun {
    private final Target target;
    private final ReloadingAnimation animation;
    private boolean alreadyFired;

    public Gun(Target target, ReloadingAnimation animation) {
        this.target = target;
        this.animation = animation;
    }

    public void fire() {
        if (alreadyFired) return;

        this.target.isHit();
        alreadyFired = true;
        this.animation.play(new Countdown());
    }
}
