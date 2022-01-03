package Lab11;

import java.security.SecureRandom;

public abstract class Animal {

    public String nameOfAnimal;
    private int speedAnimal;

    public Animal(int maxSpeed) {
        this.speedAnimal = new SecureRandom().nextInt(maxSpeed + 1);
    }

    protected int getSpeedAnimal() {
        return speedAnimal;
    }

    protected String getAnimalName() {
        String nameOfAnimal = getClass().getSimpleName();
        return nameOfAnimal;
    }

    protected abstract boolean flyAble();

}