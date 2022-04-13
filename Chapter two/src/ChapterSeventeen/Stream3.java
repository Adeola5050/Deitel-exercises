package ChapterSeventeen;

import java.util.stream.IntStream;

public class Stream3 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,20).summaryStatistics());

    }
}
