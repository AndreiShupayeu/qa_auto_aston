package home_work_1;
// Вывести на экран информацию о том является ли целое
//число записанное в переменную n, чётным либо нечётным.
public class Task4 {
    public static void main(String[] args) {
        int n=1000;
        if(isDigitEven(n)){
            System.out.println("Число является четным");
        }else {
            System.out.println("Число является нечетным");
        }
    }
    public static boolean isDigitEven(int n){
        return n % 2 == 0;
    }
}
