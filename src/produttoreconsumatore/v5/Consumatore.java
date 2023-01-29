package produttoreconsumatore.v5;

public class Consumatore extends Thread {

    private String name;
    private Buffer buffer;

    public Consumatore(String name, Buffer buffer){
        super(name);
        this.buffer = buffer;
    }

    public void run() {
        try {
            for(int i = 0; i < 100; i++) {
                int contenuto = buffer.getContenuto();
                sleep(80);

            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
}