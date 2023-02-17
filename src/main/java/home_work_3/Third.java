package home_work_3;

//3.Создать клас 3 вызвать метод с модификатором паблик и с модификатором пекдж прайвет
//4ю Создать паблик статик метод и  вызвать его в другом классе
public class Third {
    public static void printFourthPoint() {
        System.out.println("Создать паблик статик метод и  вызвать его в другом классе");
    }

    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.sum(6, 7));

    }
}
