package ChapterSeventeen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueWords {
    public static void displayUniqueWords(String sentence){
        sentence=sentence.toLowerCase();
        Arrays.stream(sentence.split(""))
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

    }
}
