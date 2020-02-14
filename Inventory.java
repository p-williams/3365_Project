//Inventory class
import java.io.File;
import java.util.Scanner;

public class Inventory extends Item{

    //Allows for a large amount of items to be in the file
    private File InventoryFile;
    private Item[] item = new Item[100];

    public Inventory(){

    }
    //getter for the inventory file
    public File getInventoryFile() {
        //get return InventoryFile
        return InventoryFile;
    }

    //setter for inventory file
    public void setInventoryFile(File inventory){
        this.InventoryFile = inventory;
    }
    //the method that returns an item the user inputs
    public void ReturnItem(){
        //creates a new object for the users input
        Scanner scan = new Scanner(System.in);
        System.out.print("What item are you returning?\n");
        //gets the input
        String ReturnItem = scan.nextLine();

        System.out.print("I will return your " +ReturnItem+ "\n");
        //destroys the inputted item
        scan.close();
    }
}
