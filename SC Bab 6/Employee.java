package Praktikum6.Prak;

/**
 * Created by Zain Fikri H on 29/04/2017.
 */
import java.util.*;
public class Employee {
    private String name;
    private double salary;
    private Date hireday;
    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, double salary, int year,int month, int day){
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        this.hireday = calendar.getTime();
    }
    public Date getHireDay(){
        return hireday;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary+=raise;
    }
}
