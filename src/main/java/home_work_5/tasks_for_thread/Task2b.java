package home_work_5.tasks_for_thread;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//2.Создать метод которы будет в паралеле создавать массивы из 5 рандомных значений
//количество потоков 10
//Генерация данных  происходит паралельно, используется один и тот же метод
//метод возвращает разные значения каждому из потоков
public class Task2b {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Work());
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}

class Work implements Runnable {
    Random random = new Random();

    @Override
    public void run() {
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ints));
    }
}