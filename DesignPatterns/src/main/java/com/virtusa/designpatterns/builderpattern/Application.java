package main.java.com.virtusa.designpatterns.builderpattern;

/*Pizza ordering use case Example*/

public class Application {
    public static void main(String[] args) {

        Pizza.Builder builder=new Pizza.Builder("medium");
        Pizza pizza1=builder.cheese(true).bacon(false).slices(12).pepperoni(true).build();
        System.out.println(pizza1);

        Pizza.Builder builder1=new Pizza.Builder("large");
        Pizza pizza2=builder1.cheese(true).bacon(false).slices(6).build();
        System.out.println(pizza2);

    }
}
