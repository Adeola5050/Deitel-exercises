package africa.semicolon.phoneBook;

import africa.semicolon.phoneBook.controllers.ContactController;
import africa.semicolon.phoneBook.data.models.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static ContactController contactController = new ContactController();

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}
