package home_work_1;

//искать в тексте ">>-->" и выводить количество в консоль
public class Task9 {
    public static void main(String[] args) {
        String s = "искать в тексте >>--> и выводить количество в консоль  >>-->";

        System.out.println(findPatternInString(s, ">>-->"));
    }

    public static int findPatternInString(String string, String pattern) {
        char[] charsS = string.toCharArray();
        char[] charsP = pattern.toCharArray();
        int counter = 0;
        int charsPIndex = 0;
        for (int i = 0; i < charsS.length; i++) {
            if (charsS[i] == charsP[charsPIndex]) {
                charsPIndex++;
            } else {
                if (charsPIndex > 0) {
                    i--;
                }
                charsPIndex = 0;
            }
            if (charsPIndex == charsP.length) {
                counter++;
                charsPIndex = 0;
            }
        }
        return counter;
    }
}
