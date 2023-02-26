package home_work_4;

import java.util.ArrayList;

//1. Создать метод, который принимает на вход джененрик
//2. создать метод, который принимает и возвращает дженерик (разные типы)
//* создать дженерик-класс с любым методом, которой использует данный дженерик
public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> strings = getArrayListGenerics("Pasha", "Andrei");
        System.out.println(strings);
        ArrayList<String> strings1 = getArrayListGenericsEnhance("Lesha", "Misha", 5);
        System.out.println(strings1);

        GenClass<Integer> genClass = new GenClass<>(7);
        int result = genClass.getValue();
        System.out.println(result);
    }

    public static <T> ArrayList<T> getArrayListGenerics(T firstElement, T secondElement) {
        ArrayList<T> result = new ArrayList<>();
        result.add(firstElement);
        result.add(secondElement);
        return result;
    }

    public static <T, E> ArrayList<T> getArrayListGenericsEnhance(T first, T second, E param) {
        ArrayList<T> result = new ArrayList<>();
        result.add(first);
        result.add(second);
        System.out.println(param);
        return result;
    }
}

class GenClass<R> {
    private R value;

    public GenClass(R value) {
        this.value = value;
    }

    public R getValue() {
        return value;
    }
}





