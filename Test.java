package Tasks;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    private static Integer count = 0;
    private static final Integer MAX_Q = 5;
    private static Integer total = 100;
    private static String LOCK = "lock";

    public static void main(String[] args){
        Test test = new Test();
        new Thread(test.new worker()).start();
        new Thread(test.new Order()).start();

    }
    class Order implements Runnable{

        @Override
        public void run() {
            while(total > 0){
                try{
                    Thread.sleep(100);
                }
                catch (Exception e){

                }
                synchronized (LOCK) {
                    while(count == MAX_Q){
                        try{
                            System.out.println("No more Order!!!");
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (total == 0){
                        break;}
                    
                    LOCK.notify();

                }

            }

        }
    }
    class worker implements Runnable{
        @Override
        public void run(){
            while(total>0){
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (LOCK){
                    while(count == 0){
                        try{
                            LOCK.wait();
                        }
                        catch(Exception e){

                        }
                        if (total < 0){
                            break;
                        }
                        LOCK.notify();
                    }
                }
            }
        }
    }
}

