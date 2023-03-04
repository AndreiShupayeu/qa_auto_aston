package home_work_5.tasks_for_thread;

//1.Cоздать синхронизированый метод который будет использоватся в 2 разных потоках
public class Task1 {
    private int counter;

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        try {
            task1.doWork();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(task1.counter);
    }

    public synchronized void increment() {
        counter++;
    }

    public void doWork() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });
        thread1.start();
        thread.start();
        thread1.join();
        thread.join();
    }
}