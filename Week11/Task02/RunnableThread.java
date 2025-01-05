package Week11.Task02;

public class RunnableThread {
    public static void main(String[] args) {

        //create the object PrintNameRunnable
        PrintNameRunnable printA = new PrintNameRunnable("A");
        PrintNameRunnable printB = new PrintNameRunnable("B");
        PrintNameRunnable printC = new PrintNameRunnable("C");

        //create the thread object
        Thread threadA = new Thread(printA);
        Thread threadB = new Thread(printB);
        Thread threadC = new Thread(printC);
        threadA.start();
        threadB.start();
        threadC.start();


    }
}
