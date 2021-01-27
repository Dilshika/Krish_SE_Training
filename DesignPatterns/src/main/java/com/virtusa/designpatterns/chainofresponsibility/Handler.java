package main.java.com.virtusa.designpatterns.chainofresponsibility;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract double applySalary(PaySheet paySheet);
}
