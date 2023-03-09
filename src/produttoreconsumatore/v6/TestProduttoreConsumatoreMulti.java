package produttoreconsumatore.v6;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestProduttoreConsumatoreMulti {

    public static void main(String[] args) {

        // coda bloccante con capacità massima di 6 elementi
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(6);
        Incrementer incrementer = new Incrementer();
        Thread produttore1 = new Produttore("produttore_1", queue, incrementer);
        Thread produttore2 = new Produttore("produttore_2", queue, incrementer);
        Thread produttore3 = new Produttore("produttore_3", queue, incrementer);

        Thread consumatore1 = new Consumatore("consumatore_1", queue);
        Thread consumatore2 = new Consumatore("consumatore_2", queue);
        Thread consumatore3 = new Consumatore("consumatore_3", queue);

        produttore1.start();
        produttore2.start();
        produttore3.start();

        consumatore1.start();
        consumatore2.start();
        consumatore3.start();

    }

}
