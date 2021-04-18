package Exception;

import com.sun.org.apache.xpath.internal.operations.Mult;
import org.omg.CORBA.PUBLIC_MEMBER;

public class MultiThreading extends Thread {
    private Thread t;
    private String threadName;

    MultiThreading(String name){
        threadName=name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try{
            for(int i=4;i>0;i--){
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println("Thread" + threadName + "interuppted");
        }
        System.out.println("Thread " + threadName + " Exiting");
    }

    @Override
    public void start(){
        System.out.println("Starting " + threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        MultiThreading mt1=new MultiThreading("Thread-1");
        mt1.start();
        MultiThreading mt2=new MultiThreading("Thread-2");
        mt2.start();

        MultiThreading mt3=new MultiThreading("Thread-3");
        mt3.start();
    }
}
