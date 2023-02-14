package home_work_2;

//3. Создать класс дог и переопределить  в нем основые методы
//4. Перегрузить метод рост вес и движение с разыми параметрами
//(футы,метры,метрические еденицы ...)
public class Buldog extends Dog {
    @Override
    public void height() {
        System.out.println("I am tall");
    }

    @Override
    public void weight() {
        System.out.println("I have a lot of weight");
    }

    @Override
    public void moving() {
        System.out.println("I can move very quickly!");
    }

    @Override
    public void eat() {
        System.out.println("I can eat a lot!");
    }

    public void height(int meter) {
        System.out.println("My height is: " + meter + " meters");
    }

    public void weight(int kilogram) {
        System.out.println("My weight is: " + kilogram + " kilogram");
    }

    public void moving(int distanceInKilometers) {
        System.out.println("I can run: " + distanceInKilometers + " kilometers");
    }
}
