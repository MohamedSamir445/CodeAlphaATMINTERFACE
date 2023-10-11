import java.util.Scanner;

public class Transfer {
    private User user;

    public Transfer(User user) {
        this.user = user;
    }

    public void transfer() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the recipient's account number and the amount to
        // transfer
        System.out.print("Enter recipient's account number: ");
        String recipientAccountNumber = scanner.nextLine();

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        // Check if the user has sufficient balance to transfer the amount
        if (user.getAccountBalance() >= amount) {
            // Deduct the amount from the user's account balance
            user.setAccountBalance(user.getAccountBalance() - amount);

            // Display the updated account balance
            System.out.println("Successful Transaction!");
            System.out.println("Your updated account balance is: " + user.getAccountBalance());

            // Display the transfer details
            System.out.println("Transfer of " + amount + " to account number " + recipientAccountNumber + " successful.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}