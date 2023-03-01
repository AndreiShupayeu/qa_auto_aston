package home_work_5;

//5. Создать класс, унаследовать его от другого класса, создать конструктор
// с любым параметром и вызвать его
public class Task5 {
    public static void main(String[] args) {
        Child child = new Child("lesha");
    }
}

class Parent {
    private String name;
    private int age;
}

class Child extends Parent {
    private String name;

    Child(String name) {
        this.name = name;
    }
}