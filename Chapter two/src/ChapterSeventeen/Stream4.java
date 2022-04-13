package ChapterSeventeen;

import java.util.stream.IntStream;

public class Stream4 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10)
                .filter(number ->number%2==0)
                .map(number-> number*3)
                  .sum());
    }
}
