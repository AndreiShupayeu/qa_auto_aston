package home_work_2;

//1. Создать класс ТЕСТ  в нем реализовать метод в котором берется имя класса и добавляется параметр
//2. Создать 2 обьекта в нем вызвать этот метод и передать разные параметры в метод
public class Test {
    public static void main(String[] args) {
        Test firstTest = new Test();
        Test secondTest = new Test();
        System.out.println(getNameOfClassAddingParam(firstTest, " hello"));
        System.out.println(getNameOfClassAddingParam(secondTest, " hello"));
    }

    public static String getNameOfClassAddingParam(Object investigatedObject, String param) {
        return investigatedObject.getClass() + param;
    }
}
