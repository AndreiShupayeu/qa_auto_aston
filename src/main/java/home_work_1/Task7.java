package home_work_1;

import java.util.Arrays;

//Преобразовать числовой массив в boolean
//давай преобразуем четные числа в тру, нечетные - в фолс
public class Task7 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        boolean[] booleans = getBooleanArrayFromIntArray(ints);
        System.out.println(Arrays.toString(booleans));
    }

    public static boolean[] getBooleanArrayFromIntArray(int[] a) {
        boolean[] result = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] % 2 == 0;
        }
        return result;
    }
}
