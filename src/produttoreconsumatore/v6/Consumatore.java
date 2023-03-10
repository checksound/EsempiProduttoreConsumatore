package produttoreconsumatore.v6;

import java.util.concurrent.BlockingQueue;

public class Consumatore extends Thread {
    private String name;
    private BlockingQueue<Integer> queue;

    public Consumatore(String name, BlockingQueue<Integer> queue){
        super(name);
        this.queue = queue;
    }

    public void run() {
        try {
            for(int i = 0; i < 10; i++) {

                int contenuto = queue.take();
                System.out.println(Thread.currentThread().getName() + " - TAKEN <<<<<: " + contenuto);
                sleep(80);

            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
}
