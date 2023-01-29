package produttoreconsumatore.v3;

public class Produttore extends Thread {

    private Buffer buffer;

    public Produttore(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for(int i = 0; i < 100; i++) {
                buffer.addContenuto(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
