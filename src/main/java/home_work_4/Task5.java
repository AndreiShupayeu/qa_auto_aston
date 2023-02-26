package home_work_4;

//Завернуть в try catch 1/0 и вывести на ноль делить нельзя
public class Task5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нелья");
        }
    }
}