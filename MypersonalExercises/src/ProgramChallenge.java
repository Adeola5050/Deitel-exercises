import java.util.Scanner;

public class ProgramChallenge {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int total= 0;
        int gradeCounter= 1;

        while (gradeCounter<=10){
            System.out.print("Enter grade: ");
            int grade= input. nextInt();
            total= total + grade;
            gradeCounter= gradeCounter+ 1;



        }
        double average=0;
        average= total/10.0;
        System.out.printf("%n Total of all 10 grades is %d%n", total);
        System.out.printf("%n Class Average of all 10 grades is %.2f", average);
    }
}
