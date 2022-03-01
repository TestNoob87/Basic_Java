package Lab08;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public int getRandomSpeed() {
        return randomSpeed = new SecureRandom().nextInt(100);
    }

}
