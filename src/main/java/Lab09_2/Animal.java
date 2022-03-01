package Lab09_2;

import java.security.SecureRandom;

public class Animal {

    public int speed;

    protected void animalSpeed(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
    }

    public int getSpeed() {
        return speed;
    }
}
