package produttoreconsumatore.v5;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private int maxCapalility;
    private List<Integer> list = new ArrayList<>();

    public Buffer(int maxCapability) {
        this.maxCapalility = maxCapability;
    }

    public synchronized void addContenuto(int contenuto)
            throws InterruptedException {

        while(list.size()==maxCapalility) {
            wait();
        }

        System.out.println(Thread.currentThread().getName() +  " - PUT >>>>: " + contenuto);
        list.add(contenuto);
        notifyAll();

    }

    public synchronized int getContenuto() throws InterruptedException {

        while(list.size() == 0)
            wait();

        notifyAll();
        int contenuto = list.remove(0);
        System.out.println(Thread.currentThread().getName() + " - GET <<<<<: " + contenuto);
        return contenuto;
    }
}
