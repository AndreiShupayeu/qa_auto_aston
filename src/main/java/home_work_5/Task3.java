package home_work_5;

//3. Создать дефолтный конструктор в котором будет выводится имя класса
public class Task3 {
    public static void main(String[] args) {
        TestConstructor testConstructor = new TestConstructor();
    }
}

class TestConstructor {
    TestConstructor() {
        System.out.println(this.getClass());
    }
}
