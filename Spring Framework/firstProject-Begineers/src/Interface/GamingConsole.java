package Interface;

public interface GamingConsole {
    void up();
    void down();
    void left();
    void right();

     default void printStatement(){
        System.out.println("printStatement from gaming console.");
    }
}
