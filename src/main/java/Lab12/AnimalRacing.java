package Lab12;

import java.util.Arrays;
import java.util.List;

public class AnimalRacing {

    public static int Tiger_Max_Speed = 100;
    public static int Dog_Max_Speed = 60;
    public static int Horse_Max_Speed = 75;
    public static int Falcon_Max_Speed = 40;
    public static int Eagle_Max_Speed = 60;

    public static void main(String[] args) {
        Animal tiger = new Tiger(Tiger_Max_Speed);
        Animal dog = new Dog(Dog_Max_Speed);
        Animal horse = new Horse(Horse_Max_Speed);
        Animal falcon = new Falcon(Falcon_Max_Speed);
        Animal eagle = new Eagle(Eagle_Max_Speed);

        List<Animal> animalList = Arrays.asList(tiger, dog, horse, falcon, eagle);
        int maxSpeed = 0;
        String winner = " ";

        for (Animal animal : animalList) {
            if (!animal.performFly() && animal.getSpeed() >= maxSpeed) {
                maxSpeed = animal.getSpeed();
                winner = animal.getAnimalName();
            }
        }

        System.out.println("Winner is: " + winner + " with speed: " + maxSpeed);


    }
}
