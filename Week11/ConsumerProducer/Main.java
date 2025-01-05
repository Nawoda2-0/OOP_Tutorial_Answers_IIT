package Week11.ConsumerProducer;

public class Main {
    public static void main(String[] args) {

        MessageQueue queue = new MessageQueue(10);
        Thread producer = new Producer(queue);
        Thread consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}
