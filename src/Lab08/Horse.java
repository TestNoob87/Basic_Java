package Lab08;

import java.security.SecureRandom;

public class Horse extends Animal {

    public int getRandomSpeed() {
        return randomSpeed = new SecureRandom().nextInt(75);
    }

}
