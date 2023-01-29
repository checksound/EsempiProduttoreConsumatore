package produttoreconsumatore.v3;

public class Consumatore extends Thread {

    private Buffer buffer;

    public Consumatore(Buffer buffer){
        this.buffer = buffer;
    }

    public void run() {
        try {
            for(int i = 0; i < 100; i++) {
                int contenuto = buffer.getContenuto();

            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
}
