package Lab12;

public class Horse extends Animal {

    public Horse(int maxSpeed) {
        super(maxSpeed);
        flyAble = new FlyIsFalse();
    }


}
