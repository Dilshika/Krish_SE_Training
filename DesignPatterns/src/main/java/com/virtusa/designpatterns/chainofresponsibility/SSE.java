package main.java.com.virtusa.designpatterns.chainofresponsibility;

public class SSE extends Handler{
    @Override
    public double applySalary(PaySheet paySheet) {
        if(paySheet.getPosition()=="SSE"){
            paySheet.setSalary(350_000);
            return paySheet.getSalary();
        }else {
            return successor.applySalary(paySheet);
        }
    }
}
