package home_work_4;

import java.util.HashMap;
import java.util.Map;

//1.Создать hashMap и добавить в него несколько  объектов разных классов.
public class Task1 {
    public static void main(String[] args) {
        Runnable horse = new Horse();
        Runnable mouse = new Mouse();
        HashMap<Integer, Runnable> sportsmen = new HashMap<>();
        sportsmen.put(1, horse);
        sportsmen.put(2, mouse);
        for (Map.Entry<Integer, Runnable> entry : sportsmen.entrySet())
            System.out.println(entry);
    }
}

interface Runnable {
    void run();
}

class Horse implements Runnable {
    public void run() {
        System.out.println("I can run very fast");
    }

    @Override
    public String toString() {
        return "Horse";
    }
}

class Mouse implements Runnable {
    @Override
    public String toString() {
        return "Mouse";
    }

    public void run() {
        System.out.println("I can run very slowly");

    }
}