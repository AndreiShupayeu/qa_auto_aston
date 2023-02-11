package home_work_1;

//Перобразовать массив в строку и обртано в массив
public class Task5 {
    public static void main(String[] args) {
        char[] chars = {'P', 'a', 's', 'h', 'a'};
        String string=getStringFromArray(chars);
        System.out.println(string);
        char[] charsFromArray=getCharArrayFromString(string);
        for (char a:charsFromArray){
            System.out.println(a);
        }

    }

    public static String getStringFromArray(char[] chars) {
        StringBuilder result = new StringBuilder();
        for (char a : chars) {
            result.append(a);
        }
        return result.toString();
    }
    public static char[] getCharArrayFromString(String string){
        return string.toCharArray();
    }
}
