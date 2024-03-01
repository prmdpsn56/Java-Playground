package Interface;

public class ChessGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("c Jump");
    }

    @Override
    public void down() {
        System.out.println("c goes into a hole");
    }

    @Override
    public void left() {
        System.out.println("c turns left");
    }

    @Override
    public void right() {
        System.out.println("c turns right");
    }
}
