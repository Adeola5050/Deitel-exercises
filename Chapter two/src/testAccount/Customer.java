package testAccount;

public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account hisAccount) {
        this.account = hisAccount;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}


