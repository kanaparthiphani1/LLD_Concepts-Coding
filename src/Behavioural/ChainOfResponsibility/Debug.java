package Behavioural.ChainOfResponsibility;

public class Debug extends Logger{

    public Debug(Logger logger) {
        super(logger);
    }

    public void log(int logLevel, String message) {
        if(logLevel==2){
            System.out.println("Debug : "+message);
            return;
        }
        super.log(logLevel,message);
    }
}
