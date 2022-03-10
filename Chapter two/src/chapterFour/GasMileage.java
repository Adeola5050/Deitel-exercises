package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 0;
        System.out.println("Enter the miles covered or -1 to quit");
       int mile= input.nextInt();
        System.out.println("Enter the gallons used or -1 to quit");
        int gallon = input.nextInt();

        System.out.println("Enter the number of trips or -1 to quit");
       int trip = input.nextInt();
        while (counter!=-1) {
            total = total + mile + gallon /trip;
            counter = counter + 1;
            System.out.println(" Enter miles covered or -1 to quit: ");
            mile = input.nextInt();
            System.out.println(" Enter  -1 to quit: ");
          gallon = input.nextInt();
            System.out.println(" enter -1 to quit: ");
            trip = input.nextInt();
        if (counter !=0) {

            double average = (double) total / counter;
            System.out.printf("%n total of the input entered is %d%n", total);
            System.out.printf("Average is %.2f%n", average);

        }
        }
    }
}