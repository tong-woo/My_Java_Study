/**
 * An overview of scope in Java.
 *
 * In Java, scope defines where a certain variable or method is accessible in a program. In this article, we will cover the following scope topics:
 *
 * Types of variable scope
 * Access modifiers
 * Variable Scope
 * Variables can be defined as having one of three types of scope:
 *
 * class level scope
 * method level scope
 * block scope
 */

public class Car {
    public String color;
    private int speed;

    public Car(String carcolor, int carspeed) {
        // Variables color and speed accessible here
        color = carcolor;
        speed = carspeed;
    }

    public void drive(boolean fourWheel) {
        // Variables color and speed accessible here
        fourWheel = true;
    }

    public static void main(String[] args) {
        Car ferrari = new Car("red", 200);
        System.out.println(ferrari.color);
        System.out.println(ferrari.speed);
        //System.out.println(ferrari.fourWheel); // This will throw an error
    }
}

