package Lab11;

import java.security.SecureRandom;

public abstract class Animal {

    public String name;
    private final int speedAnimal;

    protected abstract boolean flyAble();

    public Animal(int maxSpeed) {
        this.speedAnimal = new SecureRandom().nextInt(maxSpeed + 1);
    }

    protected int getSpeedAnimal() {
        return speedAnimal;
    }

    protected String getAnimalName() {
        return getClass().getSimpleName();
    }

}