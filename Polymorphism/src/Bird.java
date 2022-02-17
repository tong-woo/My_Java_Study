// Parent class:
class Bird{
    public Bird(){
        //instructions to create a bird
    }

    public void move(){
        System.out.println("The bird flies away");

    }
}

//child class
class Penguin extends Bird {
    public Penguin() {
        //Instructions for creating a penguin

    }
    //override the super class method
    @Override
    public void move(){
        System.out.println("The penguin waddles away");
    }

    public static void main(String[] args){
        Penguin myPenguin = new Penguin();
        myPenguin.move();
    }
}