package Interface;

public class DummyAlgorithm implements ComplexAlgo {
    @Override
    public int complexAlgorithm(int number1, int number2) {
        return 0;
    }

    @Override
    public void printf() {
        ComplexAlgo.super.printf();
    }
}
