package ChapterSix;

import java.sql.SQLOutput;
import java.util.Scanner;


public class MenuSwitchcase {
    public static void main(String[] args) {
        String prompt = """
                Press 1 Phonebook
                Press 2 Messages
                Press 3 Chat 
                Press 4 Call register
                Press 5 Tones 
                Press 6 Settings 
                Press 7 Call divert
                Press 8 Games 
                Press 9 Calculator
                Press 10 Reminders 
                Press 11 Clocks 
                Press 12 Profiles
                Press 13 Sim services
                """;

        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int userOpt = scanner.nextInt();
        //System.out.println(phoneBookSearch);
        switch (userOpt) {
            case 1:
                System.out.println("1 for Search");
                System.out.println("2 for Service Nos.");
                System.out.println("3 for Add name");
                System.out.println("4 for Erase");
                System.out.println("5 for Edit");
                System.out.println("6 for Assign tone");
                System.out.println("7 for Send b'card");
                System.out.println("8 for Options");
                System.out.println("9 Speed dials");
                System.out.println("10 Voice tags");

                System.out.println("Pick an option");
                int option = scanner.nextInt();
                switch (option) {
                    case 8:
                        System.out.println("1.Type of view");
                        System.out.println("2. Memory status");
                        break;
                }
                break;
            case 2:
                System.out.println("1.Write messages");
                System.out.println("2. Inbox");
                System.out.println("3. Outbox");
                System.out.println("4. Picture messages");
                System.out.println("5. Templates");
                System.out.println("6.Smileys");
                System.out.println("7 Message settings");
                System.out.println("8.Info service");
                System.out.println("9. Voice mailbox number");
                System.out.println("10. Service command editor");


                System.out.println("Message settings");
                int msopt = scanner.nextInt();
                switch (msopt) {


                    case 7:
                        System.out.println("1 for Set 1");
                        System.out.println("2. for Common");

                        break;
                }

                System.out.println("Set 1");
                int mssetopt = scanner.nextInt();
                switch (mssetopt) {
                    case 1:
                        System.out.println("1.Message centre number");
                        System.out.println("2. Message sent as ");
                        System.out.println("3. Message validity");

                        System.out.println("Common");
                        int comopt = scanner.nextInt();
                        switch (comopt) {
                            case 2:
                                System.out.println("1. Delivery reports");
                                System.out.println("2. Reply via same centre");
                                System.out.println("3. Character support ");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("3 for Chat");
                        break;
                }
                break;
            case 4:
                System.out.println("1- Missed calls");
                System.out.println("2- Received calls");
                System.out.println("3- Dialled calls");
                System.out.println("4- Erase recent call lists ");
                System.out.println("5- Show call duration");
                System.out.println("6- Show call costs");
                System.out.println("7- Call cost settings");
                System.out.println("8- Prepaid credit");

                System.out.println("Show call duration");
                int showoption = scanner.nextInt();
                switch (showoption) {
                    case 5:
                        System.out.println("1. Last call duration");
                        System.out.println("2. All calls' duration");
                        System.out.println("3. Received calls' duration");
                        System.out.println("4. Dialled calls' duration");
                        System.out.println("5. Clear timers");

                        System.out.println("Show call costs");
                        int pickopt = scanner.nextInt();
                        switch (pickopt) {
                            case 6:
                                System.out.println("1 Last call cost");
                                System.out.println("2 All calls' cost");
                                System.out.println("3 Clear counters");

                                System.out.println("Call cost settings");
                                int costoption = scanner.nextInt();
                                switch (costoption) {
                                    case 7:
                                        System.out.println("Call cost limit");
                                        System.out.println("Show costs in");
                                        break;
                                }
                                break;
                            case 5:
                                System.out.println("1-> Ringing tone");
                                System.out.println("2-> Ringing volume");
                                System.out.println("3-> Incoming call alert");
                                System.out.println("4-> Composer");
                                System.out.println("5-> Message alert tone");
                                System.out.println("6-> Keypad tones");
                                System.out.println("7-> Warning and game tones");
                                System.out.println("8-> Vibrating alert");
                                System.out.println("9-> Screen saver");
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("1. Call settings");
                        System.out.println("2. Phone settings");
                        System.out.println("3. Security settings");
                        System.out.println("4. Restore factory settings");

                        System.out.println("Choose option");
                        int chooseopt = scanner.nextInt();
                        switch (chooseopt) {
                            case 1:
                                System.out.println("1 for Automatic redial");
                                System.out.println("2 for Speed dialling");
                                System.out.println("3 for Call waiting options");
                                System.out.println("4 for Own number sending");
                                System.out.println("5 for Phone line in use");
                                System.out.println("6 for Automatic answer");

                                System.out.println("Select option");
                                int seloption = scanner.nextInt();
                                switch (seloption) {
                                    case 2:
                                        System.out.println("1: Language");
                                        System.out.println("2: Cell info display");
                                        System.out.println("3: Welcome note");
                                        System.out.println("4: Network selection");
                                        System.out.println("5: Lights");
                                        System.out.println("6: Confirm sim service actions");

                                        System.out.println("Choose your choice");
                                        int choice = scanner.nextInt();
                                        switch (choice) {
                                            case 3:
                                                System.out.println("1- PIN code request");
                                                System.out.println("2- Call barring service");
                                                System.out.println("3- Fixed dialling");
                                                System.out.println("4- Closed user group");
                                                System.out.println("5- Change access codes");
                                                break;
                                        }
                                        break;
                                    case 7:
                                        System.out.println("Call divert");
                                        break;
                                }
                                break;
                            case 8:
                                System.out.println("Games ");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Calculator");
                        break;
                }
                break;

            case 10:

                System.out.println("Reminders");
                break;
        }

        System.out.println("Select clock");
        int selclock = scanner.nextInt();
        switch (selclock) {
            case 11:
                System.out.println("1>> Alarm clock");
                System.out.println("2>> Clock settings");
                System.out.println("3>> Date setting");
                System.out.println("4>> Stopwatch");
                System.out.println("5>> Countdown timer");
                System.out.println("6>> Auto update of date and time");

                break;

        }


                                        }
                                }

                        









        







