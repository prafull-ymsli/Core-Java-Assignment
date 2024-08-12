// Q-30 Create a Java class to manage a bank account with functionalities to deposit, withdraw, and check balance.

import java.util.Random;

public class BankAccount {

    private static class BankDetails{
        String bankName;
        String bankIFSC;
        String accountHolderName;
        long accountNumber;
        long balance;

        public BankDetails(String bankName, String bankIFSC, String accountHolderName, long accountNumber, long balance) {
            this.bankName = bankName;
            this.bankIFSC = bankIFSC;
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    private BankDetails bank;
    BankAccount(BankDetails bankDetails){
        this.bank = bankDetails;
    }

    private static long generateRandom() {
        int length=12;
        Random random = new Random();
        char[] digits = new char[length];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return Long.parseLong(new String(digits));
    }

    public static BankDetails createBank(String name){
        return new BankDetails("SBI", "SBIN001", name, generateRandom(), 0L);
    }

    public void deposit(long amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        this.bank.balance+=amount;
        System.out.println("Deposited amount "+amount);
    }

    public void withdraw(long amount){
        if(amount <0 || this.bank.balance < amount){
            System.out.println("Cannot be withdrawn");
            return;
        }
        this.bank.balance -= amount;
        System.out.println("Amount "+amount+" withdrawn successfully");
    }

    public long getBalance(){
        return this.bank.balance;
    }


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(BankAccount.createBank("Prafulla Shekhar"));
        bankAccount.deposit(10000);
        bankAccount.withdraw(200);
        System.out.println(bankAccount.getBalance());
    }

}
