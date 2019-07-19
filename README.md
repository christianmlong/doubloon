# Apache Kafka Class Sample Code

This is the sample code for the Apache Kafka class.

Copy-pasting the code from the lab materials results in a lot of formatting errors. This code runs and displays the behavior that the lab intends.

When you paste in these messages in to the producer console, you will see those messages printed out in the consumer console.

```
{"event": "CUSTOMER_SEES_BTCPRICE", "customer": {"id": "86689427", "name": "Edward S.", "ipAddress": "95.31.18.119"}, "currency": {"name": "bitcoin", "price": "USD"}, "timestamp": "2017-07- 03T12:00:35Z"}

{"event": "CUSTOMER_SEES_BTCPRICE", "customer": {"id": "18313440", "name": "Julian A.", "ipAddress": "185.86.151.11"}, "currency": {"name": "bitcoin", "price": "USD"}, "timestamp": "2017-07- 04T15:00:35Z"}

{"event": "CUSTOMER_SEES_BTCPRICE", "customer": {"id": "56886468", "name": "Lindsay M.", "ipAddress": "186.46.129.15"}, "currency": {"name": "bitcoin", "price": "USD"}, "timestamp": "2017-07- 11T19:00:35Z"}O
```

Also, be careful when copy-pasting the console commands from the main slide deck (`kafka-console-consumer.sh` etc.). I had a problem where copying from the deck inserted some extra spaces.

## Run the sample app

```
gradle jar
java -jar ./build/libs/doubloon-0.1.0.jar localhost:9092 vipConsumersGroup source-topic target-topic
```

Paste an event in to the producer console. You should see the event appear in the consumer console.
