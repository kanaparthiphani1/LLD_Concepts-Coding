package Behavioural.ChainOfResponsibility;

public class Info extends Logger{
    public Info(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==1){
            System.out.println("Info : "+message);
            return;
        }
        super.log(logLevel, message);
    }
}
