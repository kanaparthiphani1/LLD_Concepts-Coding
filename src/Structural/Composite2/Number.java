package Structural.Composite2;

public class Number implements ArithematicExpression{
    public int val;

    public Number(int val) {
        this.val = val;
    }

    @Override
    public int evaluate() {
        return val;
    }
}
