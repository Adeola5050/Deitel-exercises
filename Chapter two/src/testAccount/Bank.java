package testAccount;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private String sortCode;
    private ArrayList <Customer> customers;

    public Bank(String bankName,String sortCode,ArrayList<Customer> customers) {
        this.bankName = bankName;
        this.customers = customers;
        this.sortCode = sortCode;
    }



    public String getBankName() {
        return bankName;
    }

    public String getSortCode() {

        return sortCode;
    }

    public ArrayList<Customer> getCustomers() {

        return customers;
    }

    public void setBankName(String bankName) {

        this.bankName = bankName;
    }

    public void setSortCode(String sortCode) {

        this.sortCode = sortCode;
    }

    public void setCustomers(ArrayList<Customer> customers) {

        this.customers = customers;
    }
}
