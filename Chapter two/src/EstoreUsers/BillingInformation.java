package EstoreUsers;

public class BillingInformation {
    private int receiverPhoneNumber;
    private String receiverName;
    private String deliveryAddress;
    private CreditCardInformation creditCard;

    public BillingInformation(int receiverPhoneNumber, String receiverName, String deliveryAddress, CreditCardInformation creditCard) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName= receiverName;
        this.deliveryAddress= deliveryAddress;
        this.creditCard= creditCard;
    }
}
