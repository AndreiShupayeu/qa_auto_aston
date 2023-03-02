package home_work_5;

import java.util.HashMap;
import java.util.Map;

//2. * посчитать для стринги сколько раз используется каждый символ (попробовать решить через map)
public class Task2 {
    public static void main(String[] args) {
        String sentence = "посчитать для стринги сколько раз используется каждый символ";
        informSymbolsQuantity(sentence);
    }

    public static void informSymbolsQuantity(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char aChar : chars) {
            if (hashMap.get(aChar) == null) {
                hashMap.put(aChar, 1);
            } else {
                hashMap.put(aChar, hashMap.get(aChar) + 1);
            }
        }
        System.out.println(hashMap);
    }
}
