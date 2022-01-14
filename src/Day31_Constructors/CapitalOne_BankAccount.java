package Day31_Constructors;

public class CapitalOne_BankAccount {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Brandon Cabrera", 8675309);
        
        account1.deposit(10000);
        account1.checkBalance();

        account1.withdraw(4300.50);
        account1.checkBalance();

        System.out.println("-----------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987456123);

        account2.deposit(3000);

        account2.checkBalance();

    }
}
