package home_work_1;

//Факториал числа
public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(getFactorial(a));
    }

    public static int getFactorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

}
