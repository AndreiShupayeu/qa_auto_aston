package home_work_4;

//Проверить конструкцию без catch с final
public class Task6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c = a / b;
        } finally {
            System.out.println("на ноль делить нелья");
        }
    }
}
