package Structural.Proxy;

public class EmployeeProxy implements EmployeeDao{
    private EmployeeDao empDao;

    public EmployeeProxy() {
        this.empDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, String empName) {
        if(client.equalsIgnoreCase("ADMIN")){
            empDao.create(client,empName);
            return;
        }
        System.out.println("Access Denied for : "+client);
    }

    @Override
    public void getProfile(String client, String empId) {
        if(client.equalsIgnoreCase("ADMIN")  || client.equalsIgnoreCase("USER")){
            empDao.getProfile(client,empId);
            return;
        }
        System.out.println("Access Denied for : "+client);

    }
}
