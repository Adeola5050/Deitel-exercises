import java.util.Scanner;

public class Inputs {
    public static <string> void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = scan.nextInt();
//        scan.close();
//        System.out.println("The chosen number is:" + n);
//        System.out.println("What is your name: ");
//        string name= (string) scan.nextLine();
//        scan.close();
//        System.out.println("Hello," + name + "!");


        System.out.println("Enter a String: ");
        Scanner scan=new Scanner(System.in);
        String text= scan.nextLine();
        System.out.println(text.trim());

    }
}
