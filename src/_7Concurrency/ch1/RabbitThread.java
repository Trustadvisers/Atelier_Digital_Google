package _7Concurrency.ch1;

public class RabbitThread extends Thread {

    private int nr;

    public RabbitThread(int nr){
        this.nr=nr;

    }
    @Override
    public  void run(){
        System.out.println("Rabbit nr "+ nr + "is running");

    }
}
