package chapterFour;

import java.util.Scanner;

public class ErrorCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Age you wanna check");
       int age=0;
        input.nextInt();

        if (age >= 65) {
            System.out.println("Age is greater than or equal to 65");
        }
        else
            System.out.println("Age is less than 65");
    }
}
