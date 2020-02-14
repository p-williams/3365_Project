//This class is the return function. When the user wants to return an item
//the item is written to the file and the file is updated for more users to buy
public class Item {
    //things in the file
    public String ItemName;
    public float ItemPrice;
    public int ItemQuantity;

    //constructor
    public Item() {
       ItemName = "";
       int ItemPrice = 0;
       int ItemQuantity = 0;
    }

    public static void open() {
        //open file to program
        System.out.print("Hello");
    }

    //getter for Name of the product
    public String getItemName() {
        //get return item
        return ItemName;
    }

    //setter for Name of the product
    public void setItemName(String product){
        this.ItemName = product;
    }
    //getter for cost
    public float getItemPrice() {
        //get return item
        return ItemPrice;
    }
    //setter for cost
    public void setItemPrice(float cost){
        this.ItemPrice = cost;
    }
}
