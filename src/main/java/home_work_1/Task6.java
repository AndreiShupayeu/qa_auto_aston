package home_work_1;

//Добавить к каждому элементу массива слова hello
public class Task6 {
    public static void main(String[] args) {
        String[] strings = {"Andrei", "Pasha", "Vasya"};
        String[] strings1 = addHelloToArray(strings);
        for (String s : strings1) {
            System.out.println(s);
        }
    }

    public static String[] addHelloToArray(String[] strings) {
        String[] strings1 = new String[strings.length];
        for (int i = 0; i < strings1.length; i++) {
            strings1[i] = strings[i] + " hello";
        }
        return strings1;
    }
}