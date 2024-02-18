package myanimals;

public class Animal {
    public static void main(String[] args) {
        System.out.println(Cat.getNumOfAnimals());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Whiskers";
        myCat.age = 4;
        myCat.livesRemaining = 9;

        Cat myCat2 = new Cat();
        myCat2.meow();
        myCat2.name = "Dante";
        myCat2.age = 12;
        myCat2.livesRemaining = 4;


        Dog myDog = new Dog();
        myDog.woof();
        myDog.name = "Jetta";
        myDog.age = 8;

        Dog myDog2 = new Dog();
        myDog2.woof();
        myDog2.name = "Ghia";
        myDog2.age = 10;


        System.out.println(Cat.getNumOfAnimals());
        System.out.println(Dog.getNumOfAnimals());

    }
}