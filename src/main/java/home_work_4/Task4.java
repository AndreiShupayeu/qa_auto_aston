package home_work_4;

import java.util.HashSet;
import java.util.Set;

//Создать set и передать в него 2 одинаковых значения (в сете остается 2 значения)
public class Task4 {
    public static void main(String[] args) {
        Car firstCar = new Car("Black", "V-6", 2020);
        Car secondCar = new Car("Black", "V-6", 2020);
        Set<Car> carSet = new HashSet<>();
        carSet.add(firstCar);
        carSet.add(secondCar);
        System.out.println(carSet);

    }
}

class Car {
    private String color;
    private String engine;
    private int year;

    Car(String color, String engine, int year) {
        this.color = color;
        this.engine = engine;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", year=" + year +
                '}';
    }
}
