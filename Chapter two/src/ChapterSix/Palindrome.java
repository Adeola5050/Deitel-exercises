package ChapterSix;

import java.util.Scanner;
    public class Palindrome{
        public static void main(String[] args){

            Scanner input= new Scanner(System.in);
            System.out.println("Enter 5 digits");

            int userInput= input.nextInt();
            int number1=userInput/10000;

            int number2=(userInput% 10000)/1000;

            int number3=(userInput% 1000)/100;

            int number4=(userInput% 100)/10;

            int number5=(userInput% 10)/1;

            System.out.printf("%d %d %d %d %d%n",number1, number2, number3, number4, number5);

            if (number1==number5){
                if (number2==number4){

                    System.out.println("It is a palindrome");
                }
            }
            if(number1!=number5){
                if(number2!=number3){

                    System.out.println("It is not palindrome");
                }
            }




        }

}
