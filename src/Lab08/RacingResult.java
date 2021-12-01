package Lab08;

public class RacingResult {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Horse horse = new Horse();

        if (horse.getRandomSpeed() > tiger.getRandomSpeed() && horse.getRandomSpeed() > dog.getRandomSpeed()) {
            System.out.println("Winner is: " + horse.getClass().getSimpleName() + " with speed: " + horse.getRandomSpeed());
        } else if (tiger.getRandomSpeed() > horse.getRandomSpeed() && tiger.getRandomSpeed() > dog.getRandomSpeed()) {
            System.out.println("Winner is: " + tiger.getClass().getSimpleName() + " with speed: " + tiger.getRandomSpeed());
        } else {
            System.out.println("Winner is: " + dog.getClass().getSimpleName() + " with speed: " + dog.getRandomSpeed());
        }

    }
}
