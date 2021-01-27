package main.java.com.virtusa.designpatterns.chainofresponsibility;

public class SE extends Handler{
    @Override
    public double applySalary(PaySheet paySheet) {
        if(paySheet.getPosition()=="SE"){
            paySheet.setSalary(200_000);
            return paySheet.getSalary();
        }else {
            return successor.applySalary(paySheet);
        }
    }
}
