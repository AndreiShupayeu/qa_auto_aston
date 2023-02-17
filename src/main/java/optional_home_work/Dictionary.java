package optional_home_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//Есть лист стрингов вида "Котионов Павел Викторович, 1988 г.р." и другие люди.
//Научиться сортировать по году рождения, имени и фамилии
public class Dictionary {
    public static void main(String[] args) {
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("Котионов Павел Викторович, 1988 г.р.");
        dictionary.add("Иванов Иван Иванович, 1987 г.р.");
        dictionary.add("Петров Петр Петрович, 1989 г.р.");
        dictionary.add("Сидоров Владимир Владимирович, 1950 г.р.");
        dictionary.add("Григорьев Григорий Григорьевич, 2000 г.р.");

        ArrayList<Person> people = getListPersonFromListString(dictionary);

        people.stream()
                .sorted(Comparator.comparing(Person::getSurname))
                .forEach(System.out::println);
        System.out.println("____________________");

        people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
        System.out.println("____________________");

        people.stream()
                .sorted(Comparator.comparing(Person::getYear))
                .forEach(System.out::println);

    }

    public static ArrayList<Person> getListPersonFromListString(ArrayList<String> inputList) {
        ArrayList<Person> listPersons = new ArrayList<>();
        for (String record : inputList) {
            String[] strings = record.split(" ");
            Person person = new Person(strings[0], strings[1].trim(), Integer.parseInt(strings[3].trim()));
            listPersons.add(person);
        }
        return listPersons;
    }

}
