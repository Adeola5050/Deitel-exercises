package Test;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount= new Account();
        System.out.printf("Initial name %s%n%n", myAccount.getName());
        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName("Adeola Esther");
        System.out.println();
        System.out.printf("Name in object myAccount is: %n%s%n","Adeola Esther", myAccount.getName());

    }
}
