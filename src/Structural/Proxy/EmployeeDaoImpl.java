package Structural.Proxy;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, String empName) {
        System.out.println("Employee : "+empName+" is created");
    }

    @Override
    public void getProfile(String client, String empId) {
        System.out.println("Getting Emp : "+empId+ " details");
    }
}
