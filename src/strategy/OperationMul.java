package strategy;

public class OperationMul implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
