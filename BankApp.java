public class BankApp {
    public static void main(String[] args) {
        // creating bank account objects
        BankAccount acc1 = new BankAccount("111", "Batman");
        BankAccount acc2 = new BankAccount("222" , "Robin");
        //Method calling to display the accounts
        displayAccount(acc1); //sends a BankAccount object acc1
        System.out.println(" ");
        displayAccount(acc2); //sends a BankAccount object acc2
        //deposit of money into acc1 and acc2
        acc1.deposit(100);
        acc2.deposit(50);
        //Method calling to display the accounts after deposit
        System.out.println(" ");
        System.out.println("***AFTER DEPOSITS***");
        displayAccount(acc1); //sends a BankAccount object acc1
        System.out.println(" ");
        displayAccount(acc2); //sends a BankAccount object acc2
        //withdrawal of money from accounts
        acc1.withdraw(75);
        acc2.withdraw(75); // will not withdraw as there must be a minimum set
        //Method calling to display the accounts after deposit
        System.out.println(" ");
        System.out.println("***AFTER WITHDRAWALS***");
        displayAccount(acc1); //sends a BankAccount object acc1
        System.out.println(" "); //space
        displayAccount(acc2); //sends a BankAccount object acc2

    }

    //Method that accepts a bank account object and displays the account number
    static void displayAccount(BankAccount acc1In )
    {
        System.out.println("Account Number:" + acc1In.getAccountNumber());
        System.out.println("Account Name:" + acc1In.getAccountName());
        System.out.println("Account Balance:" + acc1In.getBalance());
    }
}
