package main.java.com.dil.datatypes.primitive;

public class ShortDataType {
    public static void main(String[] args) {
        short number=500;
        short number1=5000;

        short sum= (short) (number+number1);    //This is also generate int there for cast into short

        System.out.println(number+"+"+number1+"="+sum);

        short aNumber=7;
        short bNumber=5;

        short sub= (short) (aNumber-bNumber);    //Casting as it generates int

        System.out.println(aNumber+"-"+bNumber+"="+sub);

        short binShort=0B1101;      //assign binary value
        System.out.println("This is binary value 1101:"+binShort);

        short hexDecimal=-0x8f;     //assign hexadecimal value
        System.out.println("This is hexadecimal 0x8f:"+hexDecimal);

        short octal=0145;    //assign octal value
        System.out.println("This is octal 0145:"+octal);

    }
}
