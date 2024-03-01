package Interface;

public interface ComplexAlgo {

    int complexAlgorithm(int number1, int number2);

    default void printf(){
        System.out.println("printf");
    }

}
