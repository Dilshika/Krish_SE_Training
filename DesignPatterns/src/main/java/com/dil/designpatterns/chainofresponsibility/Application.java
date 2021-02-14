package main.java.com.dil.designpatterns.chainofresponsibility;

public class Application {
    public static void main(String[] args) {
        SSE sse=new SSE();
        SE se=new SE();
        ASE ase=new ASE();
        Intern intern=new Intern();
        Salary salary=new Salary();

        salary.setSuccessor(sse);
        sse.setSuccessor(se);
        se.setSuccessor(ase);
        ase.setSuccessor(intern);

        PaySheet paySheet=new PaySheet(101,"SSE");
        System.out.println(paySheet.getPosition()+" "+salary.applySalary(paySheet));

        PaySheet paySheet1=new PaySheet(309,"ASE");
        System.out.println(paySheet1.getPosition()+" "+salary.applySalary(paySheet1));

        PaySheet paySheet2=new PaySheet(409,"Intern");
        System.out.println(paySheet2.getPosition()+" "+salary.applySalary(paySheet1));


    }
}
