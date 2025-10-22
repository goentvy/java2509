package entvy.mariadb;

public class Employee {
    private int empNo;
    private String empName;
    private String dept;
    private String hireDate;
    private int salary;

    public Employee(int empNo, String empName, String dept, String hireDate, int salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int getEmpNo() { return empNo; }
    public String getEmpName() { return empName; }
    public String getDept() { return dept; }
    public String getHireDate() { return hireDate; }
    public int getSalary() { return salary; }
}