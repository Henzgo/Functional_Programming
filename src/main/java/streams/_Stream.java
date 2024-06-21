package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Vivienne", Gender.FEMALE),
            new Person("James", Gender.MALE),
            new Person("Evangelique", Gender.FEMALE),
            new Person("Alice", Gender.FEMALE)
            );

            // people.stream()
            //     .map(person -> person.gender)
            //     .collect(Collectors.toSet())
            //     .forEach(System.out::println);
            Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

            boolean containsOnlyFemales = people.stream()
                    .anyMatch(personPredicate);

            System.out.println(containsOnlyFemales);
    }
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", gender=" + gender + "]";
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
