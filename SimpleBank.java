import java.util.Scanner;

public class SimpleBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean exit = false;
        while(!exit){
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.print("Amount to deposit: "); 
                    balance += sc.nextDouble(); 
                    break;
                case 2: 
                    System.out.print("Amount to withdraw: "); 
                    double amt = sc.nextDouble();
                    if(amt>balance) System.out.println("Insufficient funds");
                    else balance -= amt; 
                    break;
                case 3: 
                    System.out.println("Balance: " + balance); 
                    break;
                case 4: 
                    exit = true; 
                    break;
                default: 
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
