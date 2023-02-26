package home_work_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//* написать метод с прокидыванием эксепшена на уровень выше (throws) +
// + выкинуть в методе проверяемое исключение и обработать его в методе, который его вызывает.
//* отловить любое проверяемое исключение и выкинуть любое непроверяемое
public class Task8 {
    public static void demonstrateExceptions() throws Exception {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Выкинули проверяемое исключение и обработали его");
        }
    }

    public static void main(String[] args) throws Exception {
        demonstrateExceptions();

        File file = new File("file");
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (IOException e) {
            System.out.println("Мы поймали проверяемое исключение и выкидываем непроверяемое");
            throw new ArithmeticException();
        }
    }
}
