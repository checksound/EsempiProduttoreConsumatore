package produttoreconsumatore.v1;

public class Produttore extends Thread {

    private Buffer buffer;

    public Produttore(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("PUT >>>>: " + i);
            buffer.addContenuto(i);
        }
    }
}
