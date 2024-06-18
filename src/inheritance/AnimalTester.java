package inheritance;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Animal("Test animal", "Huge", 500);
        Dog doggo = new Dog("Husky", "chonky", 25);
        doAnimalStuff(animal, "slowly");

        doAnimalStuff(doggo, "fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println(".................");
    }
}
