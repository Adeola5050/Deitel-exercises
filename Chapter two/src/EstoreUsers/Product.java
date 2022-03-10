package EstoreUsers;

import java.util.ArrayList;

public class Product {
    private String productId;
    private String productName;
    private int price;
    private String productDescription;
    private ArrayList<productCategory>productCategory;

    public Product(String productId, String productName, int price, String productDescription, ArrayList<EstoreUsers.productCategory> productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.price= price;
        this.productDescription=productDescription;
       this.productCategory= productCategory;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getProductDescription() {
        return productDescription;
    }


}
