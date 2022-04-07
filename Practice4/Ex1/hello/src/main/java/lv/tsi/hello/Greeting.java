package lv.tsi.hello;

public class Greeting {
    String name;

    public Greeting(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "content: Hello, my name is " + name + "!";
    }
}
