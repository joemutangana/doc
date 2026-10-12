package pss;

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String productId, productName, choice ;
        double price, discount, amountToPay=0, finalAmount=0, totalAmount=0;
        int quantityStored, quantityToPurchase, productIndex=0;
        int numberOfProducts;
        Product[] products;
        boolean isFound= false;
        

        System.out.print("Enter a nuber of products to register: ");
        numberOfProducts = sc.nextInt();

        products = new Product[numberOfProducts];
        String[] ids = new String[numberOfProducts];
        sc.nextLine();

        for(int p=0 ; p<numberOfProducts; p++){
            System.out.println("\n("+(p)+"/"+numberOfProducts+") Products Registered");
            System.out.print("Enter product "+(p+1)+" ID: ");
            productId = sc.nextLine();
            System.out.print("Enter product "+(p+1)+" name: ");
            productName = sc.nextLine();
            System.out.print("Enter product "+(p+1)+" price: ");
            price = sc.nextDouble();
            System.out.print("Enter product "+(p+1)+" available quantity: ");
            quantityStored = sc.nextInt();
            products[p] = new Product(productId, productName, price, quantityStored);
            sc.nextLine();
    
        }

        do{

            System.out.println();
            for(int i=0; i<numberOfProducts; i++){
                ids[i] = products[i].productId;
                System.out.println(products[i].productId +". "+products[i].productName+" Rwf"+products[i].price);
            }
            System.out.println("\nType 'stop' to exit the shopping.");
            
            System.out.print("Enter the product ID you want to purchase (e.g: 1001): ");
            choice = sc.nextLine();

            for(int check=0; check<numberOfProducts; check++){
                if(ids[check].equals(choice)){
                    isFound = true;
                    productIndex = check;
                }
            }
            String selectedProductName =products[productIndex].productName;
            double selectedProductPrice = products[productIndex].price;
            int storedQuantity = products[productIndex].quantityStored;

            if(isFound && products[productIndex].quantityStored > 0){

                

                do {
                    System.out.print("How many " + selectedProductName + "'s you want: ");
                    quantityToPurchase = sc.nextInt();

                    while (quantityToPurchase <= 0){
                        System.out.println("Quantity can't be less than or equal 0.");
                        System.out.print("How many " + selectedProductName + "'s you want: ");
                        quantityToPurchase = sc.nextInt();

                    }

                    while (quantityToPurchase > products[productIndex].quantityStored){
                        if(storedQuantity >0){
                            System.out.println("Not enough stock. Only " + storedQuantity + " remaining");
                            System.out.print("How many " + selectedProductName + "'s you want: ");
                            quantityToPurchase = sc.nextInt();
                            while (quantityToPurchase <= 0){
                                System.out.println("Quantity can't be less than or equal 0.");
                                System.out.print("How many " + selectedProductName + "'s you want: ");
                                quantityToPurchase = sc.nextInt();
        
                            }
                            

                        }
                        else{
                            System.out.println("No " + selectedProductName+ " remaining");
                            isFound=false;
                            break;
                        }
                        
                    }
                    
                    if(quantityToPurchase > 0 || quantityToPurchase <= storedQuantity){
                          
                        products[productIndex].quantityStored -= quantityToPurchase;
                        amountToPay = selectedProductPrice * quantityToPurchase;
                        totalAmount +=amountToPay;  
                        isFound=false;
                    }
                    else{
                        isFound=false;
                    }
                   
                    
                        

                } while (quantityToPurchase < 0 || quantityToPurchase > storedQuantity);
                sc.nextLine();
            }
            else if(isFound && products[productIndex].quantityStored < 1){
                System.out.println("\nNo items in the stock for the product");
                isFound =false;
            }
            else{
                while(!isFound && !choice.toLowerCase().equals("stop")){
                    System.out.println("\nProduct does not exist. Try again");
                    System.out.print("Enter the product ID you want to purchase (e.g: 1001): ");
                    choice = sc.nextLine();
                    for (int check = 0; check < numberOfProducts; check++) {
                        if (ids[check].equals(choice)) {
                            isFound = true;
                            productIndex = check;
                        }
                    }
                }
            }



        } 
        while(!choice.toLowerCase().equals("stop"));

        if (totalAmount >= 10000) {
            discount = totalAmount * 0.15;
            

        } else if (totalAmount >= 5000) {
            discount = totalAmount * 0.05;
            

        } else {
            discount = totalAmount * 0.01;
           
        }
        finalAmount = totalAmount - discount;
        System.out.println("\nOriginal amount: Rwf"+totalAmount);
        System.out.println("Discounted amount: Rwf"+discount);
        System.out.println("Amount to Pay: Rwf"+finalAmount);
        System.out.println("\nRemaining stock: ");
        for(int s=0; s<numberOfProducts; s++){
            System.out.println(products[s].productName +"  " +products[s].quantityStored);
        }
        System.out.println("\n\n");

    }

    
}


