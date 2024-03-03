interface AnimalFactory{
    Animal createAnimal();
}

class CatFactory implements AnimalFactory{

    @Override
    public Animal createAnimal(){
        return new Cat();
    }
}

class DogFactory implements AnimalFactory{

    @Override
    public Animal createAnimal(){
        return new Dog();
    }
}


interface Animal{
    void talk();
}


class Cat implements Animal{

    @Override
    public void talk(){
        System.out.println("Hello, I'm a cat.");
    }
  
}
class Dog implements Animal{

    @Override
    public void talk(){
        System.out.println("Hello, I'm a dog.");
    }
  
}


public class AbstractFactoryPattern {

    public static void main(String[] args) {
       AnimalFactory catFactory = new CatFactory();
       AnimalFactory dogFactory = new DogFactory();

       final Animal cat = catFactory.createAnimal();
       final Animal dog = dogFactory.createAnimal();


       cat.talk();
       dog.talk();
    }
}
