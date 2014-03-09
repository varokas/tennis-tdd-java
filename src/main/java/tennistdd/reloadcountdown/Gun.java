package tennistdd.reloadcountdown;

public class Gun {
    private final Target target;
    private boolean alreadyFired;

    public Gun(Target target) {
        this.target = target;
    }

    public void fire() {
        if (alreadyFired) return;

        this.target.isHit();
        alreadyFired = true;
    }
}
