import java.util.Scanner;
public class Main
{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String user = "user";
        int pass = 0;
        int bank = 0;
        int num1 = 0;
        int num2 = 0;
        int choice = 0;
        Inventory currentInventory = new Inventory();
        
        
        Item i1 = new Item();
        Item i2 = new Item();
        
        i1.ItemName = "Dog Food"; 
        i1.ItemPrice = 4;
        i1.ItemQuantity = 15;
        
        i2.ItemName = "Cat Food";
        i2.ItemPrice = 5;
        i2.ItemQuantity = 20;
        


        System.out.print("Welcome to the Pet Store\n");

        System.out.print("Pleas create an account if you do not have one:\n");
        System.out.print("1: Create Account\n");
        System.out.print("2: Employee\n");
        System.out.print("3: Costumer purchase\n");
        System.out.print("4: Costumer return\n");
        System.out.print("5: Exit\n");
        num1 = scan.nextInt();
        switch(num1){
            case 1:
                createaccount ac = new createaccount(user,pass,bank);
                ac.input(); // calls the input
                break;
            case 2:
                System.out.print("\nYou are an employee\n");
                System.out.print("How would you like to edit the inventory?\n");
                System.out.print("\n****Inventory Menu****\n\n");
                System.out.print("Name:   " + i1.ItemName + "\t Price:    " + i1.ItemPrice + "\t Quantity in Stock:    " + i1.ItemQuantity+ "\n");
                System.out.print("Name:   " + i2.ItemName + "\t Price:    " + i2.ItemPrice + "\t Quantity in Stock:    " + i2.ItemQuantity + "\n \n");
                System.out.print("1: Update: " + i1.ItemName + "\n");
                System.out.print("2: Update: " + i2.ItemName + "\n");
                System.out.print("3: Exit back to main menu \n");
                choice = scan.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Update " + i1.ItemName);
                        break;
                    case 2:
                        System.out.print("Update " + i2.ItemName);
                        break;
                    case 3:
                        break;
                }
                
                
                //this is where the update inventory goes
                break;
            case 3:
                System.out.print("****Purchase Menu****\n\n");
                Purchase purchase = new Purchase();
                purchase.runPurchaseMenu();

                /*this will be for return and purchase a simple if statement can be
                placed here to decipher between the two*/
                break;
            case 4:
                System.out.print("Return\n");
                currentInventory.ReturnItem();
                break;
            case 5:
                System.out.print("Goodbye!");
                break;
        }
    }
}