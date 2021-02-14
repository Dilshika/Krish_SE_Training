package main.java.com.dil.designpatterns.builderpattern;

public class Pizza {

    private final String size;
    private final Integer slices;
    private final Boolean cheese;
    private final Boolean pepperoni;
    private final Boolean bacon;

    public Pizza(Builder builder){
        this.size=builder.size;
        this.slices=builder.slices;
        this.cheese=builder.cheese;
        this.pepperoni=builder.pepperoni;
        this.bacon=builder.bacon;
    }

     static class Builder {
         private String size;    //required
         private Integer slices;
         private Boolean cheese;
         private Boolean pepperoni;
         private Boolean bacon;

         public  Pizza build(){
             return new Pizza(this);

         }

         public Builder(String size) {
             this.size = size;
         }

         public Builder slices(Integer slices){
             this.slices=slices;
             return this;
         }

         public  Builder cheese(Boolean cheese){
             this.cheese=cheese;
             return this;
         }

         public  Builder pepperoni(Boolean pepperoni){
             this.pepperoni=pepperoni;
             return this;
         }

         public  Builder bacon(Boolean bacon){
             this.bacon=bacon;
             return this;
         }


     }

    @Override
    public String toString() {
        return "Builder{" +
                "size='" + size + '\'' +
                ", slices=" + slices +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", bacon=" + bacon +
                '}';
    }

}
