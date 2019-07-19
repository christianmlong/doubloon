package doubloon;
import java.util.logging.Logger;
import org.apache.kafka.clients.producer.*;
public class Writer implements Producer {

    private static final Logger LOGGER = Logger.getLogger(ProcessingApp.class.getName());

    private final KafkaProducer<String, String> producer;
    private final String topic;
    public Writer(String servers, String topic) {
        this.producer = new KafkaProducer<String, String>(Producer.createConfig(servers));
        LOGGER.info("inside Writer constructor");
        LOGGER.info(servers);
        LOGGER.info(topic);
        this.topic = topic;
    }
    @Override
    public void produce(String message) {
        ProducerRecord<String, String> pr = new ProducerRecord<String, String>(topic, message);
        LOGGER.info("before producer.send");
        LOGGER.info(message);
        producer.send(pr);
    }
}
