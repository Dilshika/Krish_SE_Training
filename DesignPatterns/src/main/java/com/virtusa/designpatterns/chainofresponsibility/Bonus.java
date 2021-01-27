package main.java.com.virtusa.designpatterns.chainofresponsibility;

public class Bonus extends Handler{
    @Override
    public double applySalary(PaySheet paySheet) {
        paySheet.setSalary(paySheet.getSalary()+paySheet.getSalary()*0.5);
        System.out.println("Bonus added");
        return paySheet.getSalary();
    }
}
