package produttoreconsumatore.v5;

public class Incrementer {

    private int incrementer = 0;

    public synchronized int getNextNumber(){
        return incrementer++;
    }
}
