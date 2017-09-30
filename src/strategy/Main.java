package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 5));

        Context context2 = new Context(new OperationMul());
        System.out.println(context2.executeStrategy(10, 5));
    }
}
