package Structural.Proxy;

public interface EmployeeDao {
    public void create(String client,String empName);
    public void getProfile(String client,String empId);
}
