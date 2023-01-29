package produttoreconsumatore.v2;

public class Buffer {

    private int contenuto;

    public synchronized void addContenuto(int contenuto) {
        this.contenuto = contenuto;

    }

    public synchronized int getContenuto() {
        return contenuto;
    }
}
