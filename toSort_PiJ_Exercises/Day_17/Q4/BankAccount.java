package toSort_PiJ_Exercises.Day_17.Q4;

/**
 * Created by mnoora02 on 17/06/2017.
 */
public class BankAccount {

    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int money) {
        balance = balance + money;
    }

    public synchronized int retrieve(int money) {
        int result = 0;
        if (balance > money) {
            result = money;
        } else {
            result = balance;
        }
        balance = balance - result;
        return result;
    }
}
