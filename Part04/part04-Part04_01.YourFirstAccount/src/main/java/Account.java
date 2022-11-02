/* 
 * DO NOT TOUCH THIS !
 */

public class Account {

     double balance;
     String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double balance) {
        this.balance = this.balance + balance;
    }

    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

    public double saldo() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
