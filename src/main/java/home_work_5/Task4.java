package home_work_5;

//4. Создать второй конструктор в котором будет выводится Имя класса и названия того кто его делал
//Сделай конструктор, который будет принимать класс в качестве параметра. В нем вызови дефолтный
// конструктор и потом выведи в консоль название класса, переданного в конструктор
public class Task4 {
    public static void main(String[] args) {
        ConstructorWithParam constructorWithParam = new ConstructorWithParam(new Param());
    }
}

class Param {
}

class ConstructorWithParam {
    ConstructorWithParam(Param param) {
        System.out.println(param.getClass());
    }
}