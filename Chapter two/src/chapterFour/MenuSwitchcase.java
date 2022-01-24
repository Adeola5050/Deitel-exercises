package chapterFour;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuSwitchcase {
    public static void main(String[] args) {
        String prompt = """
                For Phonebook press 1
                For  Messages press 2
                For Chat press 3
                For Call register press 4
                For Tones press 5
                For Settings press 6
                For Call divert press 7
                For Games press 8
                For Calculator press 9
                For Reminders press 10
                For Clocks press 11
                For Profiles press 12
                For Sim services
                """;

        /*String phoneBookSearch = """
                For Search press 1
                For  service No.s 2
                For Chat press 3
                For Call register press 4
                For Tones press 5
                For Settings press 6
                For Call divert press 7
                For Games press 8
                For Calculator press 9
                For Reminders press 10
                For Clocks press 11
                For Profiles press 12
                For Sim services
                """;*/

        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int userOpt = scanner.nextInt();
        //System.out.println(phoneBookSearch);
        switch (userOpt){
            case 1:
                System.out.println();



                }




            }
    }