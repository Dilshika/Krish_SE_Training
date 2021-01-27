package main.java.com.virtusa.designpatterns.chainofresponsibility;

public class PaySheet {
    private int empNumber;
    private String position;
    private double salary;


    protected void setSalary(double salary){
        this.salary=salary;
    }

    public PaySheet(int empNumber,String position){
        this.empNumber=empNumber;
        this.position=position;

    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}
