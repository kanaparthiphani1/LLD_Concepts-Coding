package Structural.Composite2;

public class Client {
    public static void main(String[] args) {
        ArithematicExpression exp = new Expression(new Number(10),
                new Expression(new Number(20),new Number(30),Operator.ADD),Operator.MULTIPLY);
        System.out.println(exp.evaluate());
    }
}
