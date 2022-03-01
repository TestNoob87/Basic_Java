package Lab08;

import java.security.SecureRandom;

public class Dog extends Animal {

    public int getRandomSpeed() {
        return randomSpeed = new SecureRandom().nextInt(60);
    }
}
