package EstoreUsers;

import java.util.ArrayList;

public class  Item {
    private ArrayList<Product> products;
    private ArrayList<Product>quantityOfProducts;

    public Item(ArrayList<Product> product, ArrayList<Product>quantityOfProducts) {
        this.products = product;
        this.quantityOfProducts = quantityOfProducts;

    }

}
