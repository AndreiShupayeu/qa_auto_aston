package home_work_2;
//2.Создать класс собака и  имплементировть интерфейс звери

public class Dog implements Animals {
    public void height() {
        System.out.println("I have height");
    }

    public void weight() {
        System.out.println("I have weight");
    }

    public void moving() {
        System.out.println("I can move!");
    }

    public void eat() {
        System.out.println("I can eat!");
    }
}
