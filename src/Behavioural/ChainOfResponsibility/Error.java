package Behavioural.ChainOfResponsibility;

public class Error extends Logger{

    public Error(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==3){
            System.out.println("Error : "+message);
            return;
        }
        super.log(logLevel, message);
    }
}
