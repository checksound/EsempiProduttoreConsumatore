package produttoreconsumatore.v2;

public class Consumatore extends Thread {

    private MessageBox buffer;

    public Consumatore(MessageBox buffer){
        this.buffer = buffer;
    }

    public void run() {
        for(int i = 0; i < 100; i++) {
            int contenuto = buffer.getContenuto();
            System.out.println("GET <<<<<: " + contenuto);
        }
    }
}
