package Behavioural.ChainOfResponsibility;

public abstract class Logger {
    private Logger logger;

    public Logger(Logger logger) {
        this.logger = logger;
    }

    public void log(int logLevel, String message){
        if(logger!=null){

        this.logger.log(logLevel,message);
        return;
        }
        System.out.println("Default logger  : "+message);
    }
}
