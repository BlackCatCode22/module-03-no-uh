package myanimals;

public class Cat {
    private static int numOfAnimals = 0;
    String name;
    int age;
    int livesRemaining;

    public void meow() {
        System.out.println("Meow");
    }
    public Cat() {
        numOfAnimals++;
    }

public static int getNumOfAnimals() {
        return numOfAnimals;
}
}
