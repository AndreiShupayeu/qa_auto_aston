package home_work_1;

//Вывести цену за определенный товар опираясь на его код
//(предусмотреть возможность введение неверного кода).
public class Task3 {
    public static void main(String[] args) {
        int code = 2;
        double price = getPriceByCode(code);
        if (price != 0) {
            System.out.println("Цена товара: " + price);
        }else {
            System.out.println("Нет такого кода!");
        }
    }
    public static double getPriceByCode(int code) {
        double price;
        switch (code) {
            case 1:
                price = 55;
                break;
            case 2:
                price = 45.77;
                break;
            case 3:
                price = 65.44;
                break;
            default:
                price = 0;

        }
        return price;
    }
}
