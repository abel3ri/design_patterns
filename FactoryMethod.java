import java.util.Scanner;

abstract class Factory{
    // factory method
    abstract Animal createAnimal(String name);
}


class AnimalFactory extends Factory{

    @Override
    public Animal createAnimal(String name){
        if(name.equalsIgnoreCase("cat")) return new Cat();
        else if(name.equalsIgnoreCase("dog")) return new Dog();
        return null;
    }
}


abstract class Animal{
    abstract void talk();
}


class Cat extends Animal{

    @Override
    void talk() {
        System.err.println("Hello, I'm a cat.");
    }
}

class Dog extends Animal{

    @Override
    void talk() {
        System.err.println("Hello, I'm a dog.");
    }
}


public class FactoryMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factory animalFactory = new AnimalFactory();

        System.err.print("What kind of animal to create?(cat/DOG): ");
        String animalName = sc.nextLine();
        Animal animal = animalFactory.createAnimal(animalName);
        animal.talk();

        sc.close();
    }
}