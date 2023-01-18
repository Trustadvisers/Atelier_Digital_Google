package _7Concurrency.ch2;

public class Main {
    public static void main(String argv[])throws Exception{

        BankAccount a= new BankAccount("1",50);
        BankAccount b = new BankAccount("2",100);
        TransactionThread trans=null;

        for (int i=0; i <3; i++){


            trans=new TransactionThread("Transfer",a,b,20);
            trans.start();


        }
        //trans.join(300);


    }
    //System.out.println("transfer"+ name+ "executed");
}
