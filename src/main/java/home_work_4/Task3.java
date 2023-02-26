package home_work_4;

import java.util.HashSet;
import java.util.Set;

//оздать set и передать в него 2 одинаковых значения (в сете остается 1 значение)
public class Task3 {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        hashset.add("Andrei");
        hashset.add("Pasha");
        System.out.println(hashset);
    }
}
