package MyPackage2.Encapsulation;//encapsulation

public class Employee {
    private int emp_id;
    public void setEmp_id(int eid){
        emp_id=eid;
    }
    public int getEmp_id()
    {
        return emp_id;
    }
}

class Company{
    public static void main(String[] args){
        Employee employee=new Employee();
        employee.setEmp_id(102);
        System.out.println(employee.getEmp_id());
    }
}
