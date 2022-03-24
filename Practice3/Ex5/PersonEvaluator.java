package Ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonEvaluator {
    List<Person> persons = new ArrayList<>();

    public PersonEvaluator(List<Person> persons) {
        this.persons = persons;
    }

    void findAndPrint(){
        System.out.println("\nPeople which name starts with letter 'P':");
        persons.stream()
                .filter(person -> person.name.substring(0,1).matches("P"))
                .forEach(System.out::println);

        System.out.println("\nPeople which are older than 18:");
        persons.stream()
                .filter(person -> person.age > 18)
                .forEach(System.out::println);
    }

    void groupAndPrint(){
        var result =  persons.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(result);
    }

    void getAverageAge(){
        persons.stream()
                .mapToDouble(persons -> persons.age)
                .average()
                .ifPresent(avg -> System.out.println("\nAverage age is > " + avg));
    }
}
