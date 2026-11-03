import java.util.Scanner;
public class Main {

    static TaxPayer[] taxPayers;
    static TaxAccount[] taxAccounts;
    static Declaration[] declarations;
    static Payment[] payments;

    static int arrayCapacity = 5;
    static int number;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option;


        do{
            System.out.println("");
            System.out.println("========= RRA TAX MANAGMENT SYSTEM =========");
            System.out.println("");
            System.out.println("1. Register taxpayer");
            System.out.println("2. Register tax account");
            System.out.println("3. Submit declaration and calulate tax");
            System.out.println("4. Make payment");
            System.out.println("5. View taxpayer tax summary");
            System.out.println("0. Exit");
            System.out.println("");
            System.out.print("Select the option : ");
            option = handleNonInteger(sc);

            switch(option){
                case 1:
                    registerTaxpayer(sc);
                    break;
                case 2:
                    registerTaxAccount(sc);
                    break;
                case 3:
                    submitDeclaration(sc);
                    break;
                case 4:
                    makePayment(sc);
                    break;
                case 5:
                    viewTaxpayerTaxSummary(declarations);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again");
            }

        }while(option !=0);

       

        
    }


    public static String handleBlank(Scanner sc, String userInput){
        while(true){
            if(!userInput.isBlank()){
                return userInput;
            }

            System.out.print("ERROR: Value can't be blank. Try again: ");
        }
    }

    public static String handleTaxpayerTin(Scanner sc){
        while(true){
            String tin = handleBlank(sc, sc.nextLine());

            if (tin.matches("[0-9]{10}")) {
                return tin;
            }
            System.out.print("ERROR: TIN must be 10 digits. Try again: ");

        }
        
    }

    public static int handleTaxPayerAge(Scanner sc){
        while(true){
            int age = handleNonInteger(sc);
            if(age > 18){
                return age;
            }
            System.out.print("ERROR: Tax payer age must be greater than 18. Try again: ");

        }
        


    }

    public static int handleRange(Scanner sc){
        while(true){
            int number = handleNonInteger(sc);

            if(number <= arrayCapacity){
                return number;
            }

            System.out.print("ERROR: The array capacity can't exceed 5. Try again: ");

        }
        

    }

    public static int handleNonInteger(Scanner sc){
        while(true){
            try{
                return Integer.parseInt(sc.nextLine());
            }
            catch(NumberFormatException e){
                System.out.print("ERROR: Value must be a number. Try again: ");
            }
        }
    }

    public static double handleNonDouble(Scanner sc){
        while(true){
            try{
                return Double.parseDouble(sc.nextLine());
            }
            catch(NumberFormatException e){
                System.out.print("ERROR: Invalid amount. Try again: ");
            }
        }
    }

    public static double handleNegativeDouble(Scanner sc){
        while(true){
            double userInput=handleNonDouble(sc);
            if(userInput >0){
                return userInput;
            }
            System.out.print("ERROR: The value can't be less than 0. Try again: ");
        }
    }


    public static void registerTaxpayer(Scanner sc){
        // Tax payer attributes
        String taxpayerTin;
        String taxpayerName;
        int taxpayerAge;
        String taxpayerPhone;
        String taxpayerEmail;
        

        System.out.print("How many taxpayer to rgister?: ");
        number = handleRange(sc);
        taxPayers = new TaxPayer[number];

        for (int i = 0; i < number; i++) {
            System.out.println();
            System.out.println(i + "/" + number + " Tax payers registered.");
            System.out.print("Enter tax payer TIN number: ");
            taxpayerTin = handleTaxpayerTin(sc);
            System.out.print("Enter tax payer name: ");
            taxpayerName = handleBlank(sc, sc.nextLine());
            System.out.print("Enter tax payer age: ");
            taxpayerAge = handleTaxPayerAge(sc);
        }

    }

    public static void registerTaxAccount(Scanner sc){
       String accountNumber;
       String taxpayerTin;
       String taxType;
       String accountStatus;
       System.out.print("How many tax accounts to rgister?: ");
       number = handleRange(sc);
       taxAccounts = new TaxAccount[number];

       for (int i = 0; i < number; i++) {
           System.out.println();
           System.out.println(i + "/" + number + " Tax accounts registered.");
           System.out.print("Enter account number: ");
           accountNumber = handleBlank(sc, sc.nextLine());
           System.out.print("Enter taxpayer tin number: ");
           taxpayerTin = handleTaxpayerTin(sc);
           System.out.print("Enter tax type: ");
           taxType = handleBlank(sc, sc.nextLine());
           System.out.print("Enter account status: ");
           accountStatus = handleBlank(sc, sc.nextLine());
           
        
           taxAccounts[i] = new TaxAccount(accountNumber, taxpayerTin, taxType, accountStatus);

       }

    }

    public static void submitDeclaration(Scanner sc){
        String declarationId;
        String accountNumber;
        double taxableAmount;
        double declaredTax;
        double rate=0;

        System.out.print("How many declarations to submit?: ");
        number = handleRange(sc);
        declarations = new Declaration[number];

        for (int i = 0; i < number; i++) {
            System.out.println();
            System.out.println(i + "/" + number + " Declaration submitted.");
            System.out.print("Enter declarationId: ");
            declarationId = handleBlank(sc, sc.nextLine());
            System.out.print("Enter account number: ");
            accountNumber=handleBlank(sc, sc.nextLine());
            System.out.print("Enter tax amount: ");
            taxableAmount = handleNegativeDouble(sc);
            System.out.println("");
            System.out.println("Select the tax type: ");
            System.out.println("");
            int choice;
           
            do{
                System.out.println("1. VAT(18%)");
                System.out.println("2. PAYE(15%");
                System.out.println("3. Income Tax(30%)");
                System.out.print("Make a choice <: ");
                choice = handleNonInteger(sc);
                
                if(choice == 1){
                    rate = 0.18;
                    break;
                    
                }
                else if(choice == 2){
                    rate = 0.15;
                    break;
                    

                }
                else if(choice == 3){
                    rate = 0.30;
                    break;
                    
                }
                else{
                    System.out.println("Invalid choice. Try again: ");

                }
                
                
            }while(choice != 4);

            declaredTax = taxableAmount * rate;

            declarations[i] = new Declaration(declarationId, accountNumber, taxableAmount, declaredTax);
            
            

        }


    }

    public static void makePayment(Scanner sc){
        String paymentId;
        String declarationId;
        double amountPaid;
        String paymentMethod;

        System.out.print("How many payments to make?: ");
        number = handleRange(sc);
        payments = new Payment[number];

        for (int i = 0; i < number; i++) {
            System.out.println(i + "/" + number + " Payments registered.");
            System.out.print("Enter paymentId: ");
            paymentId = handleBlank(sc, sc.nextLine());
            System.out.print("Enter declarationId: ");
            declarationId = handleBlank(sc, sc.nextLine());
            System.out.print("Enter amount paid: ");
            amountPaid = handleNegativeDouble(sc);
            System.out.print("Enter payment method: ");
            paymentMethod = handleBlank(sc, sc.nextLine());

            payments[i] = new Payment(paymentId, declarationId, amountPaid, paymentMethod);

            

        }



    }

    public static void viewTaxpayerTaxSummary(Declaration[] summary){
        if(summary == null){
            System.out.println("No summary");
        }
        else{
            for (int i = 0; i < summary.length; i++) {
                System.out.println("");
                System.out.println("======= Declaration " + (i + 1)+" ========== ");
                System.out.println();
                System.out.println("Account Number: " + summary[i].getAccountNumber());
                System.out.println("Taxable amount: Frw" + summary[i].getTaxableAmount());
                System.out.println("Declared Tax: Frw" + summary[i].getDeclaredTax());


            }

        }
        

    }

    public static String searchTin(Scanner sc){
        while(true){
            String userInput=handleTaxpayerTin(sc);
            if(taxPayers == null){
                System.out.println("No tax payer registered");
            }
            else{
                for(int i=0; i<taxPayers.length; i++){
                    if(taxPayers[i].getTaxpayerTin() == userInput){
                        System.out.println("TIN found");
                        
                    }
                }

                
            }
        }
    }

}
