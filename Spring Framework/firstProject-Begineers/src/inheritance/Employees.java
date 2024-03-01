package inheritance;

import java.math.BigDecimal;

public class Employees extends Person{

    private String title;
    private String employerName;
    private char employeeGrade;
    private BigDecimal salary;

    public Employees(String name, String phone, String email, String title) {
        super(name, phone, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString() + " & " + "Employees {" +
                "title='" + title + '\'' +
                ", employerName='" + employerName + '\'' +
                ", employeeGrade=" + employeeGrade +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void  overridingTest(){
        System.out.println("Overriding test from Employees class");

    }



}
