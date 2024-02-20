package Behavioural.Interprettor;

public class MultiplyNonTerminal implements AbstractExpression{
    private AbstractExpression ex1;
    private AbstractExpression ex2;
    public MultiplyNonTerminal(AbstractExpression ex1, AbstractExpression ex2) {
        this.ex1=ex1;
        this.ex2=ex2;
    }

    @Override
    public int interpret(Context con) {
        return ex1.interpret(con) * ex2.interpret(con);
    }
}
