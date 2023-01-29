package produttoreconsumatore.v4;

public class Produttore extends Thread {

    private String name;
    private Buffer buffer;
    private Incrementer incrementer;

    public Produttore(String name, Buffer buffer, Incrementer incrementer) {
        super(name);
        this.buffer = buffer;
        this.incrementer = incrementer;
    }

    public void run() {
        try {
            for(int i = 0; i < 100; i++) {
                int value = incrementer.getNextNumber();
                buffer.addContenuto(value);
                sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
