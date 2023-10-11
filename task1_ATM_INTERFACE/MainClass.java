import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a user object with user id, user pin, and account balance
        User user = new User("1234", "5678", 10000);
        User user2 = new User("0000", "1111", 10000);

        // Prompt the user to enter the user id and user pin
        System.out.print("Enter user id: ");
        String userId = scanner.nextLine();

        System.out.print("Enter user pin: ");
        String userPin = scanner.nextLine();

        // Check if the user id and user pin are correct
        if (user.getUserId().equals(userId) && user.getUserPin().equals(userPin)) {
            System.out.println("Welcome to the ATM!");

            // Display the ATM functionalities
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Transfer");
            System.out.println("4. Quit");

            // Prompt the user to enter the choice
            System.out.print("Enter your choice: ");

            boolean shouldContinue = true;
            while (shouldContinue) {
                // Prompt the user to enter the choice
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        // Withdrawal functionality
                        Withdrawal withdrawal = new Withdrawal(user);
                        withdrawal.withdraw();
                        System.out.println("Thank you for using Codsoft ATM!");
                        System.out.println("Press 4 to exit or do another transation: ");

                        continue;
                    case 2:
                        // Deposit functionality
                        Deposit deposit = new Deposit(user);
                        System.out.print("Enter the amount to deposit: ");
                        int amount = scanner.nextInt();
                        deposit.deposit(amount);
                        System.out.println("Thank you for using Codsoft ATM!");
                        System.out.println("Press 4 to exit or do another transation: ");
                        continue;
                    case 3:
                        // Transfer functionality
                        Transfer transfer = new Transfer(user);
                        transfer.transfer();
                        System.out.println("Thank you for using Codsoft ATM!");
                        System.out.println("Press 4 to exit or do another transation: ");
                        continue;
                    case 4:
                        // Quit functionality
                        System.out.println("Thank you for using Codsoft ATM!");
                        shouldContinue = false;
                        break;

                    default:
                        System.out.println("Invalid choice!");
                        break;
                }

            }

        } else {
            System.out.println("Invalid user id or user pin!");
        }
    }
}
