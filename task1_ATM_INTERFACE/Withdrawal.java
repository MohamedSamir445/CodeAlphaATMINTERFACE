import java.util.Scanner;

public class Withdrawal {
    private User user;

    public Withdrawal(User user) {
        this.user = user;
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount to withdraw
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();

        // Check if the user has sufficient balance
        if (user.getAccountBalance() >= amount) {
            // Update the user's account balance
            user.setAccountBalance(user.getAccountBalance() - amount);

            // Display the updated account balance
            System.out.println("Successful Transaction!");
            System.out.println("Updated account balance: " + user.getAccountBalance());

            // Add the transaction to the user's transaction history
           // user.getTransactionHistory().addTransaction("Withdrawal", amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    
}