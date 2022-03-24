package Ex5;

import java.util.ArrayList;
import java.util.List;

public class PersonProcessingWithStreams {
    public static void main(String[] args) {
         List<Person> person = new ArrayList<>();
         person.add(new Person("Max",28));
         person.add(new Person("Peter",22));
         person.add(new Person("Anna",28));
         person.add(new Person("Lilianna",16));
         person.add(new Person("Pamela",13));
         person.add(new Person("David",22));

         PersonEvaluator personEvaluator = new PersonEvaluator(person);

         personEvaluator.findAndPrint();
         System.out.println();
         personEvaluator.groupAndPrint();
         personEvaluator.getAverageAge();
    }
}
