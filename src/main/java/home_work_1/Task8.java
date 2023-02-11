package home_work_1;

import java.util.Scanner;

//Создать программу которые решает проблему
//Если время от 8 до 12 и денег больше 10 то идем в магазин,
//если время больше 12 и денег больше 50 идем в кафе
//если денег меньше 50 и время меньше 19 то идем к соседу,
//если  время больше 19 и меньше 22 то смотрим телевизор,
//если больше 22 то идем спать
//Результат выводим в консоль
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите сколько сейчас время!");
        int time = scanner.nextInt();
        System.out.println("Укажите сколько у вас денег!");
        int money = scanner.nextInt();

        getSolutionDependsOnMoneyAndTime(time, money);
    }

    //реализовано четко по условиям, но условия некорректные, непонятно как поступать ровно в 22 и нет денег
    //или, например, мы никогда не пойдем спать если есть больше 50 рублей
    public static void getSolutionDependsOnMoneyAndTime(int time, int money) {
        if (time >= 8 && time <= 12 && money > 10) {
            System.out.println("Идем в магазин");
        } else if (time > 12 && money > 50) {
            System.out.println("Идем в кафе");
        } else if (time < 19 && money < 50) {
            System.out.println("Идем к соседу");
        } else if (time > 19 && time < 22) {
            System.out.println("Смотрим телевизор");
        } else if (time > 22) {
            System.out.println("Идем спать");
        }
    }
}
