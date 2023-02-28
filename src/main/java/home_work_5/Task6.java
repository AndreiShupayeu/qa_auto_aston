package home_work_5;

//6. Создать  конструктор с одним параметром, в котором будет выводится этот параметр,
//создать конструктор с 2 параметрами, который будет вызывать конструктор с одним параметром и выводить второй параметр
public class Task6 {
    public static void main(String[] args) {
        TestConstructorParams testConstructorParams = new TestConstructorParams("First", "Second");
    }
}

class TestConstructorParams {
    private String firstParam;
    private String secondParam;

    TestConstructorParams(String firstParam) {
        this.firstParam = firstParam;
        System.out.println(firstParam);
    }

    TestConstructorParams(String firstParam, String secondParam) {
        this(firstParam);
        this.secondParam = secondParam;
        System.out.println(secondParam);

    }
}
