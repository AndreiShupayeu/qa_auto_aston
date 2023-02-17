package optional_home_work;

public class Person {
    private String surname;
    private String name;
    private int year;

    Person(String surname, String name, int year) {
        this.surname = surname;
        this.name = name;
        this.year = year;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
