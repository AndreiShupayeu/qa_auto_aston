package home_work_3;

//2.Унаследовать класс 1 классом 2 и вызвать  методы с модификатором паблик и протектет
public class Second extends First {
    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.sum(5, 10));
        System.out.println(first.difference(50, 25));
        Third.printFourthPoint();
    }
}
