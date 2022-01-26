package chapterThree;
public class Invoice {
    private String partNumber;
    private String description;
    private int itemPurchased;
    private double itemPrice;

    public Invoice(String partNumber, String description, int itemPurchased, double itemPrice) {
        this.partNumber = partNumber;
        this.description = description;
        this.itemPrice = itemPrice;
        this.itemPurchased = itemPurchased;

    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemPrice (double itemPrice){
            this.itemPrice = itemPrice;
        }


        public void setItemPurchased ( int itemPurchased){
            this.itemPurchased = itemPurchased;
        }

    public String getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getItemPurchased() {
        return itemPurchased;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
