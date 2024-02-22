package Structural.Composite2;

public class Expression implements ArithematicExpression{
    private ArithematicExpression exp1;
    private ArithematicExpression exp2;
    private Operator op;

    public Expression(ArithematicExpression exp1, ArithematicExpression exp2, Operator op) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.op = op;
    }

    @Override
    public int evaluate() {
        switch (op){
            case ADD: {
                return exp1.evaluate()+exp2.evaluate();
            }
            case SUBTRACT:{
                return exp1.evaluate()-exp2.evaluate();

            }
            case MULTIPLY:{
                return exp1.evaluate()*exp2.evaluate();

            }
            case DIVIDE:{
                return exp1.evaluate()/exp2.evaluate();

            }
            default:{
                return 0;

            }
        }
    }
}
