package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int userInput= input.nextInt();
        int firstNumber =(userInput/10000);
        int secondNumber= (userInput %10000)/1000;
        int thirdNumber =(userInput % 1000)/100;
        int fourthNumber =(userInput % 100)/ 10;
        int fifthNumber =(userInput % 10)/1;

        System.out.printf("%d %d %d %d %d", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber );

        if (firstNumber== fifthNumber)
            if(secondNumber==fourthNumber){

                System.out.println(" It is a palindrome");


            }
          if (firstNumber!= fifthNumber)
              if (secondNumber!= fourthNumber){
                  System.out.println("It is not a palindrome");
              }
    }
}
