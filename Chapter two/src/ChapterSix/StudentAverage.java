package ChapterSix;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter The Student score");
        int score;
         score= scanner.nextInt();
         if(score>=90){
             System.out.printf("%d You passed ,you are doing well",score);
         }
    }
}
