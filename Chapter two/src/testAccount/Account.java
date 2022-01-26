package testAccount;

public class Account {
    private  String name;
    private String number;
    private AccountType type;

    public Account(String name,String number,AccountType type) {
        this.name = name;
        this.number=number;
        this.type = type;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
