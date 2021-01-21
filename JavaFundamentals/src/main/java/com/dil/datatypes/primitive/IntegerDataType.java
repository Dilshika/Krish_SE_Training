package main.java.com.dil.datatypes.primitive;

public class IntegerDataType {
    public static void main(String[] args) {
        int integer=100000;
        int integer1=90000;

        int add=integer+integer1;

        System.out.println(integer+"+"+integer1+"="+add);

        int hexDecimal=0x43;  //assign hexadecimal value
        System.out.println("hexadecimal value:0x43l="+hexDecimal);

        int octVal=067;   //assign octal value
        System.out.println("octal value:067:"+octVal);

        int binVal=0B0111111101;  //assign binary value
        System.out.println("binary value of 0111111101:"+binVal);
    }
}
