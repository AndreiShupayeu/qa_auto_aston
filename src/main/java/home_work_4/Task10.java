package home_work_4;

import java.util.HashMap;
import java.util.Map;

//* посчитать для стринги сколько раз используется каждый символ (попробовать решить через map)
public class Task10 {
    public static void main(String[] args) {
        String sentence = "посчитать для стринги сколько раз используется каждый символ";
        informSymbolsQuantity(sentence);
    }

    public static void informSymbolsQuantity(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char aChar : chars) {
            hashMap.put(aChar, 0);
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            Character key = entry.getKey();
            int value = entry.getValue();
            for (char aChar : chars) {
                if (key.equals(aChar)) {
                    value++;
                    entry.setValue(value);
                }
            }
            System.out.println("Cимвол " + "\""+entry.getKey()+"\"" + " встречается  "
                    + entry.getValue() + " раз(раза)");
        }
    }
}
