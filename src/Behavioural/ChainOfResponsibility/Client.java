package Behavioural.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Logger lg = new Info(new Debug(new Error(null)));
        lg.log(2,"This is Debug message");
        lg.log(1,"This is Info message");
        lg.log(3,"This is Error message");
        lg.log(5,"This is Default message");

    }
}
