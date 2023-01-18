package _7Concurrency.ch2;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;
    public TransactionThread(String name, BankAccount from, BankAccount to, int amount){

        this.name=name;
        this.from=from;
        this.to=to;
        this.amount=amount;

    }

    @Override
    public void run(){


        transfer();

        System.out.println("After");
        System.out.println(from);
        System.out.println(to);

    }

    private void transfer(){
        synchronized (from) {
            from.withdraw(amount);
            synchronized (to) {
                System.out.println("Before");
                System.out.println(from);
                System.out.println(to);

                to.deposit(amount);

                System.out.println("After");
                System.out.println(from);
                System.out.println(to);
            }
        }

    }
}