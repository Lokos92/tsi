package Ex7;

public class Animals {
    public static void main(String... args){
        var cat = new Cat("Shishi");
        var dog = new Dog("Paiko");
        var fox = new Fox("Fubuki");

        cat.printName();
        cat.sound();
        dog.printName();
        dog.sound();
        fox.printName();
        fox.sound();
    }
}
