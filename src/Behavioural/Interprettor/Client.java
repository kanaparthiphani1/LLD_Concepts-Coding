package Behavioural.Interprettor;

public class Client {
    public static void main(String[] args) {
        Context cn = new Context();
        cn.addCOntext("a",14);
        cn.addCOntext("b",16);
        cn.addCOntext("c",13);
        cn.addCOntext("d",17);

        AbstractExpression ex1 = new MultiplyNonTerminal(
                new AddNonTerminal(new NumberTerminalExp("a"),new NumberTerminalExp("b")),
                new AddNonTerminal(new NumberTerminalExp("c"),new NumberTerminalExp("d"))
        );

        System.out.println(ex1.interpret(cn));


    }
}
