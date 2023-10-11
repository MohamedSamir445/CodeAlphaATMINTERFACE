public class Deposit {
    private User user;

    public Deposit(User user) {
        this.user = user;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        user.setAccountBalance(user.getAccountBalance() + amount);
        System.out.println("Deposit successful!");
        System.out.println("New balance: " + user.getAccountBalance());
    }
}