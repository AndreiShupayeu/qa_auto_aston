package home_work_4;

import java.util.HashMap;

//* создать hashMap и поместить туда разные объекты разных классов с общим родительским классом.
// Извлечь каждый объект и вызвать
// один и тот же переопределенный метод со своей реализацией.
public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer, Animal> zoo = new HashMap<>();
        Animal cat = new Cat();
        Animal dog = new Dog();
        zoo.put(1, cat);
        zoo.put(2, dog);
        zoo.get(1).eat();
        zoo.get(2).eat();

    }
}

class Animal {
    public void eat() {
        System.out.println("I like to eat something");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("I like to eat bones");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("I like to eat fish");
    }
}
