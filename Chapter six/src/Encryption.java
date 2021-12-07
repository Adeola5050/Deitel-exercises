import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        System.out.println("Enter the four digits");
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();


        int firstNumber= number;
        int secondNumber=number;
        int thirdNumber=number;
        int fourthNumber=number;

      /* System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);*/

        firstNumber=( number+7)%10;
        secondNumber=(number+7)%10;
        thirdNumber= (number+7)%10;
         fourthNumber=(number+7)%10;

       int firstNumber2 =thirdNumber;
       int secondNumber2 =fourthNumber;
       int thirdNumber2 =firstNumber;
       int fourthNumber2 =firstNumber;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);


    }
}
