package Lab11;

public class Eagle extends Animal {

    public Eagle(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    protected boolean flyAble() {
        return true;
    }
}
