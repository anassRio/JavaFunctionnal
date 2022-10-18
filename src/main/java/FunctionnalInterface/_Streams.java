package FunctionnalInterface;

import lombok.Value;
import java.util.List;

import static FunctionnalInterface._Streams.Gender.FEMALE;
import static FunctionnalInterface._Streams.Gender.MALE;


public class _Streams {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John",MALE),
                new Person("Aisha",FEMALE),
                new Person("Maria", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Anass", MALE)
        );

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
