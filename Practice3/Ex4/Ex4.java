package Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Ex4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a1");
        list.add("c3");
        list.add("a2");
        list.add("a3");
        list.add("b3");
        list.add("b2");
        list.add("c1");
        list.add("c2");
        list.add("b1");

        list.stream()
                .filter(item -> item.substring(0,1).matches("c"))
                .map(item -> item.toUpperCase(Locale.ROOT))
                .sorted()
                .forEach(System.out::println);
    }
}
