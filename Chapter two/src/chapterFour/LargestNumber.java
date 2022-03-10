package chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
//        System.out.println("Enter the number of units sold by each person: ");
        int number;
        int counter=1;
        int largest = 0;

        Scanner input= new Scanner(System.in);


        while(counter <10) {
            System.out.println("Enter the number of units sold by each person: ");
            number = input.nextInt();

            if(number > largest) {
                largest = number;
            }
                else
                    largest=largest;
                counter++;
            System.out.println("the largest is :" +largest);


            }
    }

    }

