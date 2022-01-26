package testAccount;

public enum AccountType{;


private String Savings;
private String Current;
private String Teens;

private final double interestRate;
AccountType(double interestRate) {
        this.interestRate = interestRate;
}
  public double getInterestRate(){
          return interestRate;
        }






}