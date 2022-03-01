package Lab11;

public class Falcon extends Animal {

    public Falcon(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    protected boolean flyAble() {
        return true;
    }
}
