package chapterFour;

import java.util.Scanner;

public class ValidatingInput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of user choice or 1 to quit: ");
       int number=input.nextInt();
       while (number!=1){
            System.out.println("Enter the number of user choice or 1 to quit: ");
            number= input.nextInt();
        }



    }
}
