package home_work_5.tasks_for_thread;
//2.Создать метод которы будет в паралеле создавать массивы из 5 рандомных значений
//количество потоков 10
//Генерация данных  происходит паралельно, используется один и тот же метод
//метод возвращает разные значения каждому из потоков

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        createArraysInThreads();
    }

    public synchronized static int[] createArray() {
        int[] result = new int[5];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 10);
        }
        return result;
    }

    public static void createArraysInThreads() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    createArray();
                }
            });
        }
    }
}
