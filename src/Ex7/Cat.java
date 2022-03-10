package Ex7;

public class Cat implements Animal, Domestic {
    String name;
    public Cat(String name){
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void printName() {
        System.out.println("Cat's name is " + name);
    }
}
