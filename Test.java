package Tasks;
import java.util.LinkedList;
import java.util.Queue;

public class Test {

    private Queue<Integer> queue = new LinkedList<Integer>();
    private static Integer total = 100;
    private final int MAX_Q = 5;

    public static void main(String[] args){
        Test test = new Test();
        new Thread(test.new worker()).start();
        new Thread(test.new Order()).start();

    }
    class Order extends Thread{

        @Override
        public void run(){
            Order();
        }
        public void Order() {
            while(total > 0){
                synchronized (queue) {
                    while(queue.size() == MAX_Q){
                        queue.notify();
                        System.out.println("No more Order!!");
                        try{
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    queue.add(1);
                    queue.notify();
                    System.out.println("Number of order in the Q" +queue.size());
                    try{
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    if (total == 0){
                        break;}


                }

            }

        }
    }
    class worker extends Thread{
        @Override
        public void run(){
            worker();}
        private void worker(){
            while(total>0){
                synchronized (queue){
                    while(queue.size() == 0){
                        queue.notify();
                        System.out.println("Empty Q");
                        try{
                            queue.wait();
                        }
                        catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        queue.poll();
                        queue.notify();
                        System.out.println("worker working and num of Q" +queue.size());
                        try{
                            Thread.sleep(100);
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        if (total < 0){
                            break;
                        }

                    }
                }
            }
        }
    }
}

