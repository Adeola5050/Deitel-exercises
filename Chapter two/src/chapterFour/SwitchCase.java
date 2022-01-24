package chapterFour;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        String prompt = """
                For Igbo press 1
                For English press 2
                For Edo press 3
                For Yoruba press 4
                For Hausa press 5
                """;
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("I speak English");
                break;
            case 2:
                System.out.println("I speak Igbo");
                break;
            case 3:
                System.out.println("I speak Edo");
                break;
            case 4:
                System.out.println("I speak Yoruba");
                break;
            case 5:
                System.out.println("I speak Hausa");
            default:
                System.out.println("Abeg get sense");
        }
    }
}
