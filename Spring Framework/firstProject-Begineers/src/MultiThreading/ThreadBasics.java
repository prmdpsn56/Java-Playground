package MultiThreading;

public class ThreadBasics extends Thread {

     public int limitNumber;

    public ThreadBasics(int limitNumber) {
        this.limitNumber = limitNumber;
    }

    public void run(){
        System.out.println("Task"+ limitNumber + ": Started");
            for (int i = (limitNumber*100+1); i <=  (((limitNumber+1)*100)-1); i++) {
                System.out.print(i + " ");
            }
        System.out.println("Task"+ limitNumber + ": Done");
    }

}
