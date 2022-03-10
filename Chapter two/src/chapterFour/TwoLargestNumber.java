package chapterFour;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        int number;
        int counter = 1;
        int largest = 0;
        int number2 = 0;

        Scanner input = new Scanner(System.in);


        while (counter < 10) {
            System.out.println("Enter the number: ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            
                if(number2 > largest)
                    largest= number2;
            }
            counter++;
            System.out.println("the largest is :" + largest);

        }
    }
}