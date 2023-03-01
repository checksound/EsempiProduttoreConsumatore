package produttoreconsumatore.v3;

public class Consumatore extends Thread {

    private MessageBox buffer;

    public Consumatore(MessageBox buffer){
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
