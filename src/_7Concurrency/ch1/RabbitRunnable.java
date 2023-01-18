package _7Concurrency.ch1;

public class RabbitRunnable implements Runnable{//cand un obiect implementeaza runnable, atunci e folosit pentru a creea un thread

    private int nr;
    public RabbitRunnable(int nr){
        this.nr=nr;

    }

    @Override
    public void run(){

        System.out.println("Rabbit number"+nr+"is running");
    }
}
