import java.util.Scanner;

public class createaccount {
    
    //initialiazes integers and strings
    public String user;
    public int pass;
    public int bank;
    
    //sets parameters
    public createaccount(String user, int pass, int bank) {
        this.user = user;
        this.pass = pass;
        this.bank = bank;
    }
    
    //returns user
    public String getuser() {
        return user;
    }
    
    //returns password
    public int getpass() {
        return pass;
    }
    
    //returns bank
    public int getbank() {
        return bank;
    }
    
    //prints output 
    public String output() { 
        return("\nYour username is: "+ this.getuser()+ 
               "\nYour password is: " + this.getpass()+
               "\nYour Bank amount is: " + this.getbank()); 
    }
    
    //function that allows user to enter account information
     public void input() {
        Scanner scan = new Scanner(System.in);
        
        //integers
        int num = 0;
        int count = 0;
        
        //menu and user input for switchcase
        System.out.print("What type of account do you want to create:\n");
        System.out.print("1: Employee account\n");
        System.out.print("2: Customer account\n");
        num = scan.nextInt();
        
        switch(num){
          case 1:
              //case 1 is for employee account
              //user enters username, password, and bank amount
              System.out.print("Enter a username: ");
              user = scan.next();
              
              System.out.print("\nEmployee password must start with 1.");
              System.out.print("\nEnter a 4 digit password: ");
              pass = scan.nextInt();
              //while loop runs until user enters correct password format
              while(count != 1){
                  /*if password is greater than 999 and less than 2000 count adds 1 and loop 
                  is exited and continues through code. however if code is less than 999 and 
                  greater than 2000 loop continues and asks user to enter corectly formated password*/
                  
                  if(pass > 999 && pass < 2000){
                        count++;
                    }
                    else{
                        System.out.print("\nYour Password did not start with 1 please re-enter:\n");
                        pass = scan.nextInt(); 
                    }
              }
              
              System.out.print("\nEnter the amount in you bank: ");
              bank = scan.nextInt();
              scan.close();
              
              break;
              
          case 2:
              //case 2 is for customer account
              //user enters username, password, and bank amount
              System.out.print("Enter a username: ");
              user = scan.next();
              
              System.out.print("\nCustomer password must start with 2.");
              System.out.print("\nEnter a 4 digit password: ");
              pass = scan.nextInt();
              
              /*if password is greater than 1999 and less than 3000 count adds 1 and loop 
                is exited and continues through code. however if code is less than 1999 and 
                greater than 3000 loop continues and asks user to enter corectly formated password*/
              while(count != 1){
                  if(pass > 1999 && pass < 3000){
                        count++;
                    }
                    else{
                        System.out.print("\nYour Password did not start with 1 please re-enter:\n");
                        pass = scan.nextInt(); 
                    }
              }
              
              System.out.print("\nEnter the amount in you bank: ");
              bank = scan.nextInt();
              scan.close();
              break;
        }
        
        //sets user input as declared variables in the contructor
        createaccount account = new createaccount(user,pass,bank);
        System.out.println(account.output());
    }
}
