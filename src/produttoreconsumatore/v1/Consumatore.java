package produttoreconsumatore.v1;

public class Consumatore extends Thread {

    private Buffer buffer;

    public Consumatore(Buffer buffer){
        this.buffer = buffer;
    }

    public void run() {
        for(int i = 0; i < 100; i++) {
            int contenuto = buffer.getContenuto();
            System.out.println("GET <<<<<: " + contenuto);
        }
    }
}
