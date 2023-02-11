package home_work_1;
//Посчитать среднее арифметическое массива.
public class Task1 {
    public static void main(String[] args) {
        int[] array={3,4,5,2,6};
        System.out.println("Среднее арифметическое массива: "+ getAverageOfArray(array));
    }
    public static double getAverageOfArray(int[]a){
       double result;
       int sum=0;
        for (int j : a) {
            sum += j;
        }
        result=sum/a.length;
        return result;
    }
}
