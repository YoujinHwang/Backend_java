package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp=new Employee(100,"id101","james",200000);
       // emp.sal=20000000000;
        long sal=emp.getSal();
        long annsal=emp.getAnnSalary();

        System.out.println(emp);
    }
}
