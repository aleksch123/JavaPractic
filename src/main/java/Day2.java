import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public class Day2 {

    public static void main(String[] args) {
        textAnalyzer("Не забывайте о том, что все великие волшебники в истории в свое время были такими же, как мы, – школьниками", 10);

        String text="Не забывайте о том, что все великие волшебники в истории в свое время были такими же, как мы, – школьниками. Если у них получилось, то получится и у нас», – Гарри Поттер.";
        List<String> forbiddenWords = new ArrayList<>();
        forbiddenWords.add("волшебники");
        forbiddenWords.add("Гарри Поттер");

        System.out.println(advancedTextAnalyzer(text,35,forbiddenWords));
    }


    public static void textAnalyzer(String text, int maxLength) {

        System.out.println("Длина текста " + text.length() + " символа(ов)");
        String trimmedText = text.replaceAll(" ", "");
        System.out.println("Длина текста без пробелов " + trimmedText.length() + " символа(ов)");
        if (text.length() % 2 == 1) {
            System.out.println("Количество символов в тексте нечетное");
        } else {
            System.out.println("Количество символов в тексте четное");
        }
        if (text.length() > maxLength) System.out.println("Длина текста превышает длину " + maxLength + " символов");
    }

    public static String advancedTextAnalyzer(String text, int maxLength, List<String> forbiddenWords) {

        String pureText=text;
        String cutText=text;
        String trimmedText = text.replaceAll(" ", "");
        for (String word:forbiddenWords) {
            pureText =pureText.replaceAll(word, "***");
        }
        if (maxLength<text.length()){
            cutText=cutText.substring(1,maxLength)+"...";
        }
        JSONObject json = new JSONObject();
        json.put("length",text.length());
        json.put("pure_length",trimmedText.length());
        json.put("origin_text",text);
        json.put("pure_text",pureText);
        json.put("pure_short_text",cutText);


     return String.valueOf(json);
    }

}
