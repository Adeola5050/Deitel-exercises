import java.util.Scanner;

public class Multiples{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int result;

        System.out.println("Enter a number: ");
        firstNumber= scan.nextInt();

        System.out.println("Enter a number");
        secondNumber=scan.nextInt();


        if(firstNumber%secondNumber==0){
            System.out.printf("%d is a multiple of %d",firstNumber, secondNumber);
        }
        if(firstNumber%secondNumber!=0){
            System.out.printf("%d is not a multiple of %d",firstNumber, secondNumber);
        }
    }
}

