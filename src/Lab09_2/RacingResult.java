package Lab09_2;

public class RacingResult {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Horse horse = new Horse();

        dog.animalSpeed(60);
        horse.animalSpeed(75);
        tiger.animalSpeed(100);

        int racingDog = dog.getSpeed();
        int racingHorse = horse.getSpeed();
        int racingTiger = tiger.getSpeed();

        if (racingDog >= racingHorse && racingDog >= racingTiger) {
            System.out.println("The Winner is: " + dog.getClass().getSimpleName() + " with Speed " + dog.getSpeed());
        }

        if (racingHorse >= racingDog && racingHorse >= racingTiger) {
            System.out.println("The Winner is: " + horse.getClass().getSimpleName() + " with Speed " + horse.getSpeed());
        }

        if (racingTiger >= racingDog && racingTiger >= racingHorse) {
            System.out.println("The Winner is: " + tiger.getClass().getSimpleName() + " with Speed " + tiger.getSpeed());
        }
    }

}
