package africa.semicolon.sendAm;

import africa.semicolon.sendAm.controllers.UserController;
import dtos.requests.RegisterUserRequest;
import dtos.responses.FindUserResponse;
import dtos.responses.RegisterUserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class Main {
    public static UserController userController = new UserController();

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        //load option
//        loadOptions();
        //if option is register
        //load form
        //print output
        //load options

        //if option is search by email
        //ask for email
        //show
        //load options

    }

    private static void loadOptions() {
        String options = """
                -> A for Register
                -> B for Find by email
                """;

        String input = collectStringInput(options);
        switch (input.toLowerCase()) {
            case "a":
                loadRegisterForm();
                break;
            case "b":
                askUserForEmail();
                break;
            default:
                display("get sense");
                loadOptions();

        }
    }




    private static  void askUserForEmail() {
            String userEmail = collectStringInput("Enter the email you want to search");
            FindUserResponse response = userController.getUserByEmail(userEmail);
            display(response.toString());
            loadOptions();
        }
        public static void loadRegisterForm(){
            RegisterUserRequest form = new RegisterUserRequest();
            form.setFirstName(collectStringInput("Enter your first name"));
            form.setLastName(collectStringInput("Enter your last name"));
            form.setEmailAddress(collectStringInput("Enter your email address"));
            form.setAddress(collectStringInput("Enter your address"));
            form.setPhoneNumber(collectStringInput("Enter your phoneNumber"));

            RegisterUserResponse response= userController.registerNewUser(form);
            display(response.toString());
            loadOptions();
    }

    private static String collectStringInput(String message) {
        Scanner scanner = new Scanner(System.in);
        display(message);
        return scanner.nextLine();
    }


private  static void display(String message){
    System.out.println();
}


}
