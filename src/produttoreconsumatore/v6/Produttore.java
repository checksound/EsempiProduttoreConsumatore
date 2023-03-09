package produttoreconsumatore.v6;

import java.util.concurrent.BlockingQueue;

public class Produttore extends Thread {

    private String name;
    private BlockingQueue<Integer> queue;
    private Incrementer incrementer;

    public Produttore(String name, BlockingQueue<Integer> queue, Incrementer incrementer) {
        super(name);
        this.queue = queue;
        this.incrementer = incrementer;
    }

    public void run() {
        try {
            for(int i = 0; i < 100; i++) {
                int value = incrementer.getNextNumber();
                System.out.println(Thread.currentThread().getName() +  " - PUT >>>>: " + value);
                queue.put(Integer.valueOf(value));
                sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
