package Structural.Proxy;

public class Client {
    public static void main(String[] args) {
        EmployeeDao emp  = new EmployeeProxy();
        emp.create("ADMIN","Phani");
        emp.getProfile("USER","Phani");
        emp.create("USER","sumathi");

    }
}
