import java.util.Scanner;

abstract class Person {
    protected String name;
    protected int age;
    protected double height;

    Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    abstract void get();

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}
