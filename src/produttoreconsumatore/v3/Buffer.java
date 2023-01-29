package produttoreconsumatore.v3;

public class Buffer {
    private boolean isFull = false;
    private int contenuto;

    public synchronized void addContenuto(int contenuto)
            throws InterruptedException {

        while(isFull) {
            wait();
        }

        isFull = true;
        System.out.println("PUT >>>>: " + contenuto);
        this.contenuto = contenuto;
        notify();

    }

    public synchronized int getContenuto() throws InterruptedException {

        while(!isFull)
            wait();

        isFull = false;
        notify();
        System.out.println("GET <<<<<: " + contenuto);
        return contenuto;
    }
}
