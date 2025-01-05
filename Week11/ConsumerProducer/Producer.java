package Week11.ConsumerProducer;

public class Producer extends Thread{
    private static int count = 0;
    private MessageQueue queue;

    public Producer(MessageQueue queue){
        this.queue = queue;
    }
    public void run(){
        for (int i = 0; i<10; i++){
            queue.put(genarateMessage());
            System.out.println("Producer uploads Message number" + 1 + " to the Queue");
        }
    }

    public synchronized String genarateMessage(){
        String msg = " Message number " + count;
        count++;
        return msg;
    }
}
