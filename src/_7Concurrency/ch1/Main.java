package _7Concurrency.ch1;

public class Main {

    public static Thread createCorrespondingThread (int nr){

        Thread toReturn;
        if (nr %2==0){
            toReturn= new RabbitThread(nr);


        }
        else{
            toReturn=new Thread(new RabbitRunnable(nr));

        }
        return toReturn;

    }
    public static void main(String argv[]){
        int nr=0;
        Thread t;


        while(nr<10){
            //System.out.println("nr=  "+ nr);
            t=createCorrespondingThread(nr);
            t.start();
            nr++;
        }

    }
}
