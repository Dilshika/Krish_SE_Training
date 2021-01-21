package main.java.com.dil.datatypes.primitive;

public class LongDataType {
    public static void main(String[] args) {
        long number=100000l;
        long number2=5789l;

        long sub=number-number2;

        System.out.println(number+"-"+number2+"="+sub);

        long hexDecimal=0x43L;  //assign hexadecimal value
        System.out.println("hexadecimal value:0x43l="+hexDecimal);

        long octVal=067L;   //assign octal value
        System.out.println("octal value:067:"+octVal);

        long binVal=0B0111111101L;  //assign binary value
        System.out.println("binary value of 0111111101:"+binVal);

    }
}
