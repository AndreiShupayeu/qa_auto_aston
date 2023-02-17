package home_work_3;
//1. Создать два класса и реализоввать в первом классе 3 метода с модификатором
//паблик прайфвет и протектет

public class First {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    protected int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
