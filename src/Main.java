import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        Stream<Person> stream = persons.stream();
        long temp =  stream.filter(x -> x.getAge() < 18).count();
        stream = persons.stream();
        List<String> tempList=  stream.filter(x -> x.getAge() >= 18 && x.getAge() <=27).
                filter(x -> x.getSex().equals(Sex.MAN)).
                map(Person::getFamily).
                map(String::new).
                collect(Collectors.toList());
        stream = persons.stream();
        List<String> tempList2=  stream.filter(x -> (x.getAge() >= 18 && x.getAge() <65 && x.getSex().equals(Sex.MAN)) ||
                        (x.getAge() >= 18 && x.getAge() <60 && x.getSex().equals(Sex.WOMAN))).
                filter(x -> x.getEducation().equals(Education.HIGHER)).
                map(Person::getFamily).
                map(String::new).
                sorted(Comparator.naturalOrder()).
                collect(Collectors.toList());

    }
}