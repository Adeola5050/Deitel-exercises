package ChapterSeven;
import java.util.Scanner;

import static java.lang.Math.max;

public class ArrayClass {
    public static void main(String[] args) {
        int[] scores = new int[0];
        Scanner scanner = new Scanner(System.in);
        //collect numbers
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter a number");
            scores[i] = scanner.nextInt();



        }
        for (int i = 0; i<scores.length; i++){
            System.out.println(scores[i] +" ");

        }
        System.out.println();
        //maximum
        int maximumNumber =scanner.nextInt();
        max(maximumNumber, scores[0]);


    }
}