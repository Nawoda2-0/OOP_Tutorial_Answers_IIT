package Week11.ConsumerProducer;

public class Consumer extends Thread{
    private MessageQueue queue;

    public Consumer(MessageQueue queue){
        this.queue = queue;
    }
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Consumer downloads " + queue.get() + " From the queue");
        }
    }
}
