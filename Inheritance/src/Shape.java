/**
 * in Java, inheritance is the concept of allowing a class to inherit the methods and properties of another class. This article will cover the following topics:
 *
 * superclasses and subclasses
 * the super() method
 * access modifiers
 *
 * Superclasses refer to the class that another class inherits from.
 * Subclasses refer to the class that inherits qualities from another class.
 * An object of a subclass inherits all the available instance variables and
 * methods provided in the superclass class.
 */



class Pho extends Noodle {
    public Pho() {
        super("flat");
    }
}

class Noodle {
    boolean isCooked = false;
    String shape;

    public Noodle(String shape) {
        this.shape = shape;
    }

    public static void main(String[] args) {
        Pho lunch = new Pho();
        System.out.println(lunch.shape);
        System.out.println(lunch.isCooked);
    }
}
