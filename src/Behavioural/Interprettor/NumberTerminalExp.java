package Behavioural.Interprettor;

public class NumberTerminalExp implements AbstractExpression{

    private  String key;
    NumberTerminalExp(String a){
        this.key = a;
    }

    @Override
    public int interpret(Context con) {
        return con.getContext(key);
    }
}
