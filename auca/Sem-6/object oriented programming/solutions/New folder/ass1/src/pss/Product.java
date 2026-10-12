package pss;

public class Product {

    String productId, productName;
    double price;
    int quantityStored;

    public Product(String productId, String productName, double price, int quantityStored){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityStored = quantityStored;
    }

    

    public void productDetails(int quantityPurchased, double amountToPay, double discount, double finalAmount){
        System.out.println("Product ID: "+productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Quantity Purchased: " + quantityPurchased);
        System.out.println("Original Amount: Rwf" + amountToPay);
        System.out.println("Discounted Amount: Rwf" + discount);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("Remaining Stock: " + quantityStored);

    }
    


    
}
