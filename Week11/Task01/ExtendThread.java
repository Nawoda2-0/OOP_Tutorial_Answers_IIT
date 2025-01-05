package Week11.Task01;

public class ExtendThread {
    public static void main(String[] args) {

        //creating threadA
        Thread threadA = new PrintNameThread("A");
        threadA.start();

        //Creating threadB
        Thread threadB = new PrintNameThread("B");
        threadB.start();

        //Creating threadC
        Thread threadC = new PrintNameThread("C");
        threadC.start();

    }
}
