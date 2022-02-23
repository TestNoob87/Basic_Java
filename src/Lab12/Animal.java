package Lab12;

import java.security.SecureRandom;

public abstract class Animal {

    FlyAble flyAble;
    private final int speed;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
    }

    public boolean performFly() {
        return flyAble.fly();
    }

    public int getSpeed() {
        return speed;
    }

    protected String getAnimalName() {
        return getClass().getSimpleName();
    }

}
