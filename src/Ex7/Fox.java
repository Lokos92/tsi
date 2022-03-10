package Ex7;

public class Fox implements Animal, Wild {
    String name;

    @Override
    public void sound() {
        System.out.println("Wa-pow");
    }

    public Fox(String name){
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Fox's name is " + name);
    }
}
