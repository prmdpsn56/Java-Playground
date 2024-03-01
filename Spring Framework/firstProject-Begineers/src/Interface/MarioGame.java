package Interface;

public class MarioGame implements GamingConsole, ComplexAlgo {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("goes into a hole");
    }

    @Override
    public void left() {
        System.out.println("turns left");
    }

    @Override
    public void right() {
        System.out.println("turns right");
    }

//    @Override
//    public void printStatement() {
//        System.out.println(" print from mario game method");
//    }

    @Override
    public int complexAlgorithm(int number1, int number2) {
        return 0;
    }
}
