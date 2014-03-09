package tennistdd.reloadcountdown;

public class Gun {
    private boolean firable = true;

    public boolean canFire() {
        return firable;
    }

    public void fire() {
        firable = false;
    }
}
