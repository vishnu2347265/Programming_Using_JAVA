// Interface declaration
interface Animal {
    void makeSound(); // Abstract method
    void eat();       // Another abstract method

    // Default method
    default void sleep() {
        System.out.println("Zzz");
    }
}

// Concrete class implementing the Animal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}

// Concrete class implementing the Animal interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.makeSound();
        myDog.eat();
        myDog.sleep();

        myCat.makeSound();
        myCat.eat();
        myCat.sleep();
    }
}
