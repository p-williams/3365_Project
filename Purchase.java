import java.util.Scanner;

public class Purchase {
    boolean exit;

    

    public void runPurchaseMenu(){
        printHeader();
        while(!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    public void printHeader(){
        System.out.println("+------------------------------+");
        System.out.println("|           Shop Pets          |");
        System.out.println("+------------------------------+");
    }

    public void printMenu(){
        System.out.println("\nShop by Category:");
        System.out.println("1: Dog");
        System.out.println("2: Cat");
        System.out.println("3: Fish");
        System.out.println("4: Bird");
        System.out.println("5: Reptile");
        System.out.println("0: Exit");
        System.out.println("What would you like to buy?");
    }

    public int getInput(){
        Scanner kb = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > 5){
            try{
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid Selection. Please try again.");
            }
        }
        return choice;
    }

    public void performAction(int choice){
        switch(choice){
            case 0:
                exit = true;
                System.out.println("\nHope to see you again soon!");
                break;
            case 1:
                pickDog();
                break;
            case 2:
                pickCat();
                break;
            case 3:
                pickFish();
                break;
            case 4:
                pickBird();
                break;
            case 5:
                pickReptile();
                break;
            default:
                System.out.println("An unknown error has occurred.");
        }
    }

    public void performActionDog(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nHope to see you again soon!");
                break;
            case 1:
                System.out.println("\nCongratulation on your poodle purchase!");
                break;
            case 2:
                System.out.println("\nCongratulation on your husky purchase!");
                break;
            case 3:
                System.out.println("\nCongratulation on your pug purchase!");
                break;
            default:
                System.out.println("An unknown error has occurred.");
        }
    }

    public void performActionCat(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                printMenu();
                choice = getInput();
                performAction(choice);
                break;
            case 1:
                System.out.println("\nCongratulation on your persian cat purchase!");
                break;
            case 2:
                System.out.println("\nCongratulation on your bengal cat purchase!");
                break;
            case 3:
                System.out.println("\nCongratulation on your siamese cat purchase!");
                break;
            default:
                System.out.println("An unknown error has occurred.");
        }
    }

    public void performActionFish(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nHope to see you again soon!");
                break;
            case 1:
                System.out.println("\nCongratulation on your gold fish purchase!");
                break;
            case 2:
                System.out.println("\nCongratulation on your betta fish purchase!");
                break;
            case 3:
                System.out.println("\nCongratulation on your molly fish purchase!");
                break;
            default:
                System.out.println("An unknown error has occurred.");
        }
    }

    public void performActionBird(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nHope to see you again soon!");
                break;
            case 1:
                System.out.println("\nCongratulation on your parrot purchase!");
                break;
            case 2:
                System.out.println("\nCongratulation on your macaw purchase!");
                break;
            case 3:
                System.out.println("\nCongratulation on your cockatoo purchase!");
                break;
            default:
                System.out.println("An unknown error has occurred.");
        }
    }

    public void performActionReptile(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nHope to see you again soon!");
                break;
            case 1:
                System.out.println("\nCongratulation on your bearded dragon purchase!");
                break;
            case 2:
                System.out.println("\nCongratulation on your leopard gecko purchase!");
                break;
            case 3:
                System.out.println("\nCongratulation on your iguana purchase!");
                break;
            default:
                System.out.println("An unknown error has occurred.");
        }
    }

    public void pickDogMenu(){
        System.out.println("\nShop dogs:");
        System.out.println("1: Poodle");
        System.out.println("2: Husky");
        System.out.println("3: Pug");
        //System.out.println("0: Exit");
    }

    public void pickDog(){
        //while(!exit) {
            pickDogMenu();
            int choice = getInput();
            performActionDog(choice);
        //}
    }

    public void pickCatMenu(){
        System.out.println("\nShop cats:");
        System.out.println("1: Persian Cat");
        System.out.println("2: Bengal Cat");
        System.out.println("3: Siamese Cat");
        //System.out.println("0: Exit");;
    }

    public void pickCat(){
        //while(!exit) {
            pickCatMenu();
            int choice = getInput();
            performActionCat(choice);
        //}
    }

    public void pickFishMenu(){
        System.out.println("\nShop fishes:");
        System.out.println("1: Gold Fish");
        System.out.println("2: Betta Fish");
        System.out.println("3: Molly Fish");
        //System.out.println("0: Exit");
    }

    public void pickFish(){
        //while(!exit){
            pickFishMenu();
            int choice = getInput();
            performActionFish(choice);
        //}
    }

    public void pickBirdMenu(){
        System.out.println("\nShop birds:");
        System.out.println("1: Parrot");
        System.out.println("2: Macaw");
        System.out.println("3: Cockatoo");
        //System.out.println("0: Exit");
    }

    public void pickBird(){
        //while(!exit){
            pickBirdMenu();
            int choice = getInput();
            performActionBird(choice);
        //}
    }

    public void pickReptileMenu(){
        System.out.println("\nShop reptiles:");
        System.out.println("1: Bearded Dragon");
        System.out.println("2: Leopard Gecko");
        System.out.println("3: Iguana");
        //System.out.println("0: Exit");
    }

    public void pickReptile(){
        //while(!exit){
            pickReptileMenu();
            int choice = getInput();
            performActionReptile(choice);
        //}
    }
}
