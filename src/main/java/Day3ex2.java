import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day3ex2 {

    public static void main(String[] args) {

        System.out.println(repeatFinder("Ну что ж я, я найти решения правильного " +
                "не смогу ж? Смогу ж конечно, я ж старательный все ж таки.",3));


    }

    public static String repeatFinder(String sourseText,int maxFrequency){
        JSONObject json = new JSONObject();
        String formattedText =sourseText.toLowerCase().replaceAll("^a-яa-z-","").replaceAll("\\.","");
        List<String> words = Arrays.asList(formattedText.split(" "));
        for (String word:words)
        {
            int frequency = Collections.frequency(words,word);
            if (frequency>=maxFrequency) {
                json.put(word,frequency);
            }
        }

        return String.valueOf(json);
    }

}

