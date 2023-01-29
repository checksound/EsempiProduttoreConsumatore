package produttoreconsumatore.v1;

public class TestProduttoreConsumatore {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread produttore = new Produttore(buffer);
        Thread consumatore = new Consumatore(buffer);

        produttore.start();
        consumatore.start();


    }

}
