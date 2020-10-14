import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day3ex1 {

    public static void main(String[] args) {
        String before[] = new String[]{"apple banana", "orange", "banana", "kiwi strawberry blueberry"};
        String after[] = reformatArray(before);

    }

    public static String[] reformatArray(String[] words) {
        List<String> newWords;
        List<String> newArray = new ArrayList<>();
        for (String word : words) {
            newWords = Arrays.asList(word.split(" "));
            newArray.addAll(newWords);
        }
        return newArray.toArray(new String[0]);
    }

}

