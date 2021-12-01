package Lab08;

import java.security.SecureRandom;

public class Animal {

    String animalName;
    int randomSpeed;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getRandomSpeed() {
        return randomSpeed = new SecureRandom().nextInt();
    }

    public void setRandomSpeed(int randomSpeed) {
        this.randomSpeed = randomSpeed;
    }
}
