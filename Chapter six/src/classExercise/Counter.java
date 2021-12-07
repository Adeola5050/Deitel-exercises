package classExercise;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        System.out.println("Enter student grade");
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        int count=1;
        int sum = 0;
        int average = 0;
        while(count<=10) {
            sum = sum + grade;
            average=sum/10;
            count++;
            System.out.println("Enter student grade");
            grade=input.nextInt();

        }

        System.out.println(sum);
        System.out.println(average);

    }
}