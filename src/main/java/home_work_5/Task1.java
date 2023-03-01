package home_work_5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//1. написать метод с try-with-resources
public class Task1 {
    public static void main(String[] args) {
        readFromFile();
    }

    public static void readFromFile() {
        try (Reader reader = new FileReader(new File("Some path"))) {
        } catch (IOException e) {
            System.out.println("We use try-with-resources");
        }
    }

}