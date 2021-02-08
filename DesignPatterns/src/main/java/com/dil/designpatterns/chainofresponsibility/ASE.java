package main.java.com.virtusa.designpatterns.chainofresponsibility;

public class ASE extends Handler{
    @Override
    public double applySalary(PaySheet paySheet) {
        if(paySheet.getPosition()=="ASE"){
            paySheet.setSalary(50_000);
            return paySheet.getSalary();
        }else {
            return successor.applySalary(paySheet);
        }
    }
}
