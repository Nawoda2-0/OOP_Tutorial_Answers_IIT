package Week11.ConsumerProducer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageQueue {

    //the size of the buffer
    private int bufferSize;

    //the buffer list of messages, assuming the String message format
    private List<String> buffer = new ArrayList<String>();

    //construct the message queue with given buffer size
    public MessageQueue(int bufferSize){
        this.bufferSize = bufferSize;
    }

    //check whether the buffer is full
    public synchronized boolean isFull(){
        return buffer.size() == bufferSize;
    }

    //check whether the buffer is empty
    public synchronized boolean isEmpty(){
        return buffer.isEmpty();
    }

    //put an income message into the queue, called by message producer
    public synchronized void put(String message){
        if (!isFull()){
            buffer.add(message);
        }

    }

    //get a message from the queue, called by the message consumer
    public synchronized String get(){
        if (!isEmpty()){
            return buffer.remove(0);
        }
        return "Buffer is empty";
    }


}
