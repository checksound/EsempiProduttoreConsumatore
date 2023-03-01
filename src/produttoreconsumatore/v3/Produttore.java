package produttoreconsumatore.v3;

public class Produttore extends Thread {

    private MessageBox buffer;

    public Produttore(MessageBox buffer) {
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
