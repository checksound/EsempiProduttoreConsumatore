package produttoreconsumatore.v1;

public class Produttore extends Thread {

    private MessageBox buffer;

    public Produttore(MessageBox buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("PUT >>>>: " + i);
            buffer.addContenuto(i);
        }
    }
}
