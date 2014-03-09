package tennistdd.reloadcountdown;

public class Gun {
    private final Target target;

    public Gun(Target target) {
        this.target = target;
    }

    public void fire() {
        this.target.isHit();
    }
}
