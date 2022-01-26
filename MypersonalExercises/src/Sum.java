import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;
        int result;
        System.out.println("Enter first Integer");
        x = input.nextInt();
        System.out.println("Enter second integer");
        y = input.nextInt();
        System.out.println("Enter third Integer");
        z = input.nextInt();
        result= x+y+z;
        System.out.printf("Product is %d%n",result);
    }
}
