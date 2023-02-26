package home_work_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//Сделать обработку исключений с nullpointer и fileIO
public class Task7 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            System.out.println(person.name.length());
        } catch (NullPointerException e) {
            System.out.println("мы поймали нпешку");
        }
        File file = new File("resources");
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (IOException e) {
            System.out.println("мы поймали fileIO исключение");
        }
    }

    static class Person {
        String name;
        int age;

    }
}