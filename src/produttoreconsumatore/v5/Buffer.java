package produttoreconsumatore.v5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Buffer {
    private int maxCapability;
    private List<Integer> list = new LinkedList<>();

    public Buffer(int maxCapability) {
        this.maxCapability = maxCapability;
    }

    public synchronized void addContenuto(int contenuto)
            throws InterruptedException {

        while(list.size() == maxCapability) {
            wait();
        }

        if(list.size() == 0)
            notifyAll();

        System.out.println(Thread.currentThread().getName() +  " - PUT >>>>: " + contenuto);
        list.add(contenuto);
    }

    public synchronized int getContenuto() throws InterruptedException {

        while(list.size() == 0)
            wait();

        if(list.size() == maxCapability)
            notifyAll();

        int contenuto = list.remove(0);
        System.out.println(Thread.currentThread().getName() + " - GET <<<<<: " + contenuto);
        return contenuto;
    }
}
