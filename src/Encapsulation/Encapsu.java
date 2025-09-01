package Encapsulation;

import java.lang.reflect.Field;

class Employee{
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0) {
            this.salary = salary;
            System.out.println(salary);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double salary;
    private String name;
}
public class Encapsu {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        Employee emp = new Employee();
//        Field fsalary = Employee.class.getDeclaredField("salary");
//        fsalary.setAccessible(true);
//        System.out.println(fsalary.get(emp));
        emp.getSalary();
        System.out.println();
    }
}
