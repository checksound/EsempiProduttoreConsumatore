package produttoreconsumatore.v4;

public class MessageBox {

    private boolean isFull = false;
    private int contenuto;

    public synchronized void addContenuto(int contenuto)
            throws InterruptedException {

        while(isFull) {
            wait();
        }

        isFull = true;
        System.out.println(Thread.currentThread().getName() +  " - PUT >>>>: " + contenuto);
        this.contenuto = contenuto;
        notifyAll();

    }

    public synchronized int getContenuto() throws InterruptedException {

        while(!isFull)
            wait();

        isFull = false;
        notifyAll();
        System.out.println(Thread.currentThread().getName() + " - GET <<<<<: " + contenuto);
        return contenuto;
    }
}
