package imperative;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John",MALE),
                new Person("Aisha",FEMALE),
                new Person("Maria", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Anass", MALE)
        );

        // Imperative approach
        System.out.println("// Imperative approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }


        // Declarative approach
        System.out.println("// Declarative approach");

        // Predicate Exepte a Person & return a Boolean
        // Predicate<Person> personPredicate = person -> FEMALE.equals(person.getGender());

        people.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .forEach(System.out::println);
    }

    @Value
    static class Person{
        private final String name;
        private final Gender gender;
    }

    enum Gender{
        MALE, FEMALE
    }
}
