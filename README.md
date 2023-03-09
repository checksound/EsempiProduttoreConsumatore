# Esempi Produttore-Consumatore

## versione 1
[produttoreconsumatore.v1.MessageBox](./src/produttoreconsumatore/v1/MessageBox.java),
[produttoreconsumatore.v1.Produttore](./src/produttoreconsumatore/v1/Produttore.java),
[produttoreconsumatore.v1.Consumatore](./src/produttoreconsumatore/v1/Consumatore.java), 
e applicazione 
[produttoreconsumatore.v1.TestProduttoreConsumatore](./src/produttoreconsumatore/v1/TestProduttoreConsumatore.java).

## versione 2
[produttoreconsumatore.v2.MessageBox](./src/produttoreconsumatore/v2/MessageBox.java) 
unica differenza con sincronizzazione dei metodi. 

## versione 3 - Produttore/Consumatore
[produttoreconsumatore.v3.MessageBox](./src/produttoreconsumatore/v3/MessageBox.java) con utilizzo di **wait()** e **notify()**,
[produttoreconsumatore.v3.Produttore](./src/produttoreconsumatore/v3/Produttore.java),
[produttoreconsumatore.v3.Consumatore](./src/produttoreconsumatore/v3/Consumatore.java),
e applicazione
[produttoreconsumatore.v3.TestProduttoreConsumatore](./src/produttoreconsumatore/v3/TestProduttoreConsumatore.java).

## versione 4 - Più produttori/Più consumatori
[produttoreconsumatore.v4.MessageBox](./src/produttoreconsumatore/v4/MessageBox.java) con utilizzo di **wait()** e **notifyAll()**,
[produttoreconsumatore.v4.Incrementer](./src/produttoreconsumatore/v4/Incrementer.java) per avere un generatore **safe** di numeri progressivi,
[produttoreconsumatore.v4.Produttore](./src/produttoreconsumatore/v4/Produttore.java),
[produttoreconsumatore.v4.Consumatore](./src/produttoreconsumatore/v4/Consumatore.java),
e applicazione
[produttoreconsumatore.v4.TestProduttoreConsumatoreMulti](./src/produttoreconsumatore/v4/TestProduttoreConsumatoreMulti.java).

## versione 5 - Buffer con capacità massima - coda bloccante
![](./BLOCKING_QUEUE_page-0001.jpg)
[produttoreconsumatore.v5.BlockingQueue](./src/produttoreconsumatore/v5/BlockingQueue.java) implementa una coda FIFO in cui più produttori e più consumatori possono inserire e prelevare dalla coda,
[produttoreconsumatore.v5.Incrementer](./src/produttoreconsumatore/v5/Incrementer.java) per avere un generatore **safe** di numeri progressivi,
[produttoreconsumatore.v5.Produttore](./src/produttoreconsumatore/v5/Produttore.java),
[produttoreconsumatore.v5.Consumatore](./src/produttoreconsumatore/v5/Consumatore.java),
e applicazione
[produttoreconsumatore.v5.TestProduttoreConsumatoreMulti](./src/produttoreconsumatore/v5/TestProduttoreConsumatoreMulti.java).

## Utilizzo della BlockingQueue





