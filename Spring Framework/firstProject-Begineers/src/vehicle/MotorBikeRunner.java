package vehicle;

public class MotorBikeRunner {

    private int topSpeed;

    public MotorBikeRunner(){
        System.out.println("this is a construtor");

    }

    public MotorBikeRunner(int speed){
        System.out.println("this is a construtor");
        this.topSpeed= speed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void start(){
        System.out.println("Motor bike started");
        System.out.println(this.topSpeed);
    }

    public void increaseSpeed(int howMuch){
        if (howMuch <= 10){
            System.out.println("hatt piche!");
            return;
        }

        this.topSpeed = this.topSpeed + howMuch;
    }
}
