package ChapterSeventeen;

import java.util.stream.IntStream;

public class Stream2 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10)
                .map(number -> number *2)
                .sum());
    }

}
