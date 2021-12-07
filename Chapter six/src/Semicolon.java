import java.util.Scanner;
public class Semicolon {
    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Input scv number");

        int scvNumber = scanner.nextInt();


        Native aNative = new Native(name, scvNumber);
        System.out.println(aNative.getName());
        System.out.println(aNative.getScvid());
    }
}
