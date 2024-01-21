package bankaccount;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with only account number
    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }

    // Constructor with account number and holder name
    public BankAccount(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    // Constructor with full initialization
    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter methods
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Example of how to use the constructors to create BankAccount objects
    public static void main(String[] args) {
        // Creating a bank account with only account number
        BankAccount account1 = new BankAccount(123456789);
        System.out.println("Account 1 - Account Number: " + account1.getAccountNumber() +
                ", Holder Name: " + account1.getAccountHolderName() +
                ", Balance: " + account1.getBalance());

        // Creating a bank account with account number and holder name
        BankAccount account2 = new BankAccount(987654321, "John Doe");
        System.out.println("Account 2 - Account Number: " + account2.getAccountNumber() +
                ", Holder Name: " + account2.getAccountHolderName() +
                ", Balance: " + account2.getBalance());

        // Creating a bank account with full initialization
        BankAccount account3 = new BankAccount(555555555, "Jane Smith", 1000.0);
        System.out.println("Account 3 - Account Number: " + account3.getAccountNumber() +
                ", Holder Name: " + account3.getAccountHolderName() +
                ", Balance: " + account3.getBalance());
    }
}

