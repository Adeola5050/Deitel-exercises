package chapterThree;
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice= new Invoice("E200","Lexus", 2, 250000.00 );

        System.out.printf("The partNumber was: %s \n", invoice.getPartNumber());
        System.out.printf("The description is: %s \n", invoice.getDescription());
        System.out.printf("The itemPurchased is: %d \n", invoice.getItemPurchased() );
        System.out.printf("The itemPrice was: %.2f \n",invoice.getItemPrice());

        invoice.setPartNumber("E200");
        invoice.setDescription("Lexus");
        invoice.setItemPurchased(4);
        invoice.setItemPrice(350000.00);

        System.out.printf("The partNumber is: %s \n", invoice.getPartNumber());
        System.out.printf("The description is: %s \n", invoice.getDescription());
        System.out.printf("The itemPurchased is: %d \n", invoice.getItemPurchased() );
        System.out.printf("The itemPrice is: %.2f \n",invoice.getItemPrice());



    }


}
