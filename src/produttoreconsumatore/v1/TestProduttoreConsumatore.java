package produttoreconsumatore.v1;

public class TestProduttoreConsumatore {

    public static void main(String[] args) {
        MessageBox buffer = new MessageBox();
        Thread produttore = new Produttore(buffer);
        Thread consumatore = new Consumatore(buffer);

        produttore.start();
        consumatore.start();


    }

}
