package Week11.Task02;

public class PrintNameRunnable implements Runnable{

    //instance variable
    String nameThread;

    //constructor
    public PrintNameRunnable(String nameThread){
        this.nameThread = nameThread;
    }

    //run method
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Thread name : " + nameThread);
        }
    }

}
