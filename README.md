# Esempi Produttore-Consumatore

## versione 1
[produttoreconsumatore.v1.Buffer](./src/produttoreconsumatore/v1/Buffer.java),
[produttoreconsumatore.v1.Produttore](./src/produttoreconsumatore/v1/Produttore.java),
[produttoreconsumatore.v1.Consumatore](./src/produttoreconsumatore/v1/Consumatore.java), 
e applicazione 
[produttoreconsumatore.v1.TestProduttoreConsumatore](./src/produttoreconsumatore/v1/TestProduttoreConsumatore.java).

## versione 2
[produttoreconsumatore.v2.Buffer](./src/produttoreconsumatore/v2/Buffer.java) 
unica differenza con sincronizzazione dei metodi. 

## versione 3 - Produttore/Consumatore
[produttoreconsumatore.v3.Buffer](./src/produttoreconsumatore/v3/Buffer.java) con utilizzo di **wait()** e **notify()**,
[produttoreconsumatore.v3.Produttore](./src/produttoreconsumatore/v3/Produttore.java),
[produttoreconsumatore.v3.Consumatore](./src/produttoreconsumatore/v3/Consumatore.java),
e applicazione
[produttoreconsumatore.v3.TestProduttoreConsumatore](./src/produttoreconsumatore/v3/TestProduttoreConsumatore.java).

## versione 4 - Più produttori/Più consumatori
[produttoreconsumatore.v4.Buffer](./src/produttoreconsumatore/v4/Buffer.java) con utilizzo di **wait()** e **notifyAll()**,
[produttoreconsumatore.v4.Incrementer](./src/produttoreconsumatore/v4/Incrementer.java) per avere un generatore **safe** di numeri progressivi,
[produttoreconsumatore.v4.Produttore](./src/produttoreconsumatore/v4/Produttore.java),
[produttoreconsumatore.v4.Consumatore](./src/produttoreconsumatore/v4/Consumatore.java),
e applicazione
[produttoreconsumatore.v4.TestProduttoreConsumatoreMulti](./src/produttoreconsumatore/v4/TestProduttoreConsumatoreMulti.java).

## versione 5 - Buffer con capacità

[produttoreconsumatore.v5.Buffer](./src/produttoreconsumatore/v5/Buffer.java) con utilizzo di **wait()** e **notifyAll()**,
[produttoreconsumatore.v5.Incrementer](./src/produttoreconsumatore/v5/Incrementer.java) per avere un generatore **safe** di numeri progressivi,
[produttoreconsumatore.v5.Produttore](./src/produttoreconsumatore/v5/Produttore.java),
[produttoreconsumatore.v5.Consumatore](./src/produttoreconsumatore/v5/Consumatore.java),
e applicazione
[produttoreconsumatore.v5.TestProduttoreConsumatoreMulti](./src/produttoreconsumatore/v5/TestProduttoreConsumatoreMulti.java).




