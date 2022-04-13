package ChapterSeventeen;

import java.util.stream.IntStream;

public class StreamArray {
    public static void main(String[] args) {
        int [] array={1, 50, 45, 66, 800, 35, 23, 2, 8, 7, 9};
        int result= IntStream.of(array).reduce(1,(x,y)-> x*y*3);
        System.out.println(result);


    }
}
