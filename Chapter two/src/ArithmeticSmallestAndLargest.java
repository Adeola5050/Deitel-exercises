import java.util.Scanner;
public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first integers: ");
        int firstInteger = scan.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = scan.nextInt();

        System.out.print("Enter third integer: ");
        int thirdInteger = scan.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger;
        int average = sum / 3;
        int product = firstInteger * secondInteger * thirdInteger;

        int temp = 0;
        if (firstInteger > secondInteger) {
            temp = firstInteger;

        }
        if (secondInteger > temp) {
            temp = secondInteger;
        }
        if (thirdInteger > temp) {
            temp = thirdInteger;
        }

        System.out.printf("The largest number is %d", temp);
    }
}
