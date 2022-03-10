package EstoreUsers;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<BillingInformation>billings;
    private ArrayList<Item>shoppingCartItems;


    public Customer(String name, Address homeAddress, String emailAddress, String password, int age, int phoneNumber) {

    }
}
