package MultiThreading;

public class AnotherThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Task 2: Started");
        for (int i = 201; i < 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Task 2: Done");
    }


}
