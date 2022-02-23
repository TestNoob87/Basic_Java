package Lab11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalRacingTest {

    public static Animal animalRacingTest(List<Animal> animalList) {
        Animal winner = null;
        for (Animal animalRacing : animalList) {
            if (!animalRacing.flyAble()) {
                if (winner == null) {
                    winner = animalRacing;
                } else {
                    if (animalRacing.getSpeedAnimal() > winner.getSpeedAnimal()) {
                        winner = animalRacing;
                    }
                }
            }

        }
        return winner;
    }

    public static void main(String[] args) {
        final int DogMaxSpeed = 60;
        final int HorseMaxSpeed = 75;
        final int TigerMaxSpeed = 100;
        final int FalconMaxSpeed = 40;
        final int EagleMaxSpeed = 60;

        Animal dog = new Dog(DogMaxSpeed);
        Animal horse = new Horse(HorseMaxSpeed);
        Animal tiger = new Tiger(TigerMaxSpeed);
        Animal falcon = new Falcon(FalconMaxSpeed);
        Animal eagle = new Eagle(EagleMaxSpeed);


        List<Animal> animalList = Arrays.asList(dog, horse, tiger, eagle, falcon);
        Animal winner = animalRacingTest(animalList);
        System.out.println("The winner is: " + winner.getAnimalName() + " with winner speed is: " + winner.getSpeedAnimal());
    }


}
