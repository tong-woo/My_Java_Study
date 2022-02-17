/**
 * Getter and Setter Methods
 *
 *
 */


public class Dog {
    private String name;

    public Dog(String dogName) {
        dogName = name;
    }

    // Other methods and constructors
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args){
        Dog myDog = new Dog("Cujo");
        myDog.setName("Lassie");
        System.out.println(myDog.getName());
    }
}








