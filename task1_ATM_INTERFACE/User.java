public  class User {
    private String userId;
    private String userPin;
    private double accountBalance;

    public User(String userId, String userPin, double accountBalance) {
        this.userId = userId;
        this.userPin = userPin;
        this.accountBalance = accountBalance;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPin() {
        return userPin;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}