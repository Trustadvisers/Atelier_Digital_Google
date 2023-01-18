package _7Concurrency.ch2;

public class BankAccount {
    private String name;
    private int debit;

    public BankAccount(String name, int debit){
        this.name=name;
        this.debit=debit;


    }

    public void withdraw(double amount){
        longDatabaseCALL();
        this.debit-=amount;

    }

    public void deposit(double amount){
        longDatabaseCALL();
        this.debit +=amount;

    }

    public void longDatabaseCALL(){
        try{
            Thread.sleep(100);


        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public String toString() {
        return "Bank account named " + name + "containts "+ debit + " $ ";
    }
}
