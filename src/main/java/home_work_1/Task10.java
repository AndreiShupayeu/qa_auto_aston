package home_work_1;
//заменить в тексте все буквы "а" на "б"
public class Task10 {
    public static void main(String[] args) {
        String s = "ааааииииббббщщщщаааа";
        String result = replaceCharsInString(s, 'а', 'б');
        System.out.println(result);

    }

    public static String replaceCharsInString(String s, char oldChar, char newChar) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder= new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
            }
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
