package main.java.com.dil.datatypes.primitive;

public class ByteDataType {
    public static void main(String[] args) {
        byte byte1 = 123;   //decimal literal
        byte byte2 = 8;

        byte sum = (byte) (byte1 + byte2);    //Sum of two bytes become integer there for we need to cast the value into byte

        System.out.println(byte1+"+"+byte2+"="+sum);

        byte aByte=3;
        byte bByte=9;
        byte subtraction= (byte) (bByte-aByte);

        System.out.println(bByte+"-"+aByte+"="+subtraction);

        byte binByte=0b11;      //assign binary value
        System.out.println("This is binary 011:"+binByte);

        byte newByte=011;   //become a octal literal
        System.out.println("This is octal 011:"+newByte);

        byte hexByte=-0x80;     //assign a hexadecimal value
        System.out.println("This is hexadecimal -0x80:"+hexByte);
    }
}
