package Creational.Singleton;

public class DatabaseConnection {
    private volatile DatabaseConnection con;

    private DatabaseConnection() {

    }

    public DatabaseConnection getConnection(){

        if(con==null){
            synchronized (DatabaseConnection.class){
                if(con==null){
                    con = new DatabaseConnection();
                }
            }
        }
        return con;
    }
}
