package EstoreUsers;

public class CreditCardInformation {
    private int cardCvv;
    private int cardExpirationYear;
    private int cardExpirationMonth;
    private int creditCardNumber;
    private String nameOnCard;
    private cardType cardType;

    public CreditCardInformation(int cardCvv, int cardExpirationYear, int cardExpirationMonth, int creditCardNumber, String nameOnCard, EstoreUsers.cardType cardType) {
        this.cardCvv = cardCvv;
        this.cardExpirationYear= cardExpirationYear;
        this.cardExpirationMonth = cardExpirationMonth;
        this.creditCardNumber = creditCardNumber;
        this.nameOnCard =nameOnCard;
        this.cardType = cardType;
    }
}
