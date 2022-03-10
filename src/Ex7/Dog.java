package Ex7;

public class Dog implements Animal, Domestic {
    String name;

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Dog's name is " + name);
    }
}
