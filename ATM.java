
public class ATM {

    private int balance;
    private int pin;

    public ATM(int balance, int pin) {
        this.balance = balance;
        this.pin = pin;

    }

    public void displayMenu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposite");
        System.out.println("3. Withdraw");
        System.out.println("4. Change Pin");
        System.out.println("5. Exit");
    }

    public void Deposite(int amount) {
        balance += balance;

    }

    public void Withdraw(int amount) {
        if (balance >= amount) {
            balance -= balance;

        } else {
            System.out.println("Insufficient Balance !");
            return;
        }
    }

    public int getbalance() {
        return balance;
    }

    public boolean validatePin(int pin) {
        return this.pin == pin;
    }

    public void changePin(int newPin) {
        this.pin = newPin;
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000, 3254);
        // atm.displayMenu();
        System.out.println("Enter the Pin:");
        int pin = Integer.parseInt(System.console().readLine());
        System.out.println("Entered pin is:"+pin);
        if( atm.validatePin(pin)){
           atm.displayMenu();
           int option =0;
           while( option!=5){
            atm.displayMenu();
            option=Integer.parseInt(System.console().readLine());
            switch (option) {
                case 1:
                    System.out.println("Balance"+ atm.getbalance());
                    break;
                case 2:
                    System.out.print("Enter the Amount:");
                    int amount=Integer.parseInt(System.console().readLine());
                    atm.Deposite( amount);
                    break;
                case 3:
                    System.out.print("Enter Amount:");
                     amount=Integer.parseInt(System.console().readLine());
                    atm.Withdraw(amount);
                    break;
                case 4:
                    System.out.print("Enter new PIN :");
                    int  newPin=Integer.parseInt(System.console().readLine());
                    atm.changePin(newPin);
                    
                    break;
                 case 5:
                    System.out.println("Thank you for using ATM!");
                    
                    break;
                
                default:
                    throw new AssertionError();
            }
           }
        }
        else{

            System.out.println("You have entered Invalid Pin");
        }
        
    }
}
