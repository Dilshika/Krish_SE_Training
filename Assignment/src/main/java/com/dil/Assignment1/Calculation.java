package main.java.com.dil.Assignment1;

import main.java.com.dil.Exception.NullStringException;

public class Calculation {
        int sum;

    public void calculateTotal(String word) throws NullStringException{
        int length=word.length();
            if(word==null){
                throw new NullStringException("String cannot be null"); //trow exception if word is null
            }

        for(int i=0;i<length;i++){

            if(word.charAt(i)=='A'| word.charAt(i)=='a'){
                sum=sum+1;
            }if(word.charAt(i)=='B'| word.charAt(i)=='b'){
                sum=sum+2;
            }
            if(word.charAt(i)=='C'| word.charAt(i)=='c'){
                sum=sum+3;
            }
            if(word.charAt(i)=='D'| word.charAt(i)=='d'){
                sum=sum+4;
            }
            if(word.charAt(i)=='E'| word.charAt(i)=='e'){
                sum=sum+5;
            }
            if(word.charAt(i)=='F'| word.charAt(i)=='f'){
                sum=sum+6;
            }
            if(word.charAt(i)=='G'| word.charAt(i)=='g'){
                sum=sum+7;
            }if(word.charAt(i)=='H'| word.charAt(i)=='h'){
                sum=sum+8;
            }if(word.charAt(i)=='I'| word.charAt(i)=='i'){
                sum=sum+9;
            }
            if(word.charAt(i)=='J'| word.charAt(i)=='j'){
                sum=sum+10;
            }
            if(word.charAt(i)=='K'| word.charAt(i)=='k'){
                sum=sum+11;
            }
            if(word.charAt(i)=='L'| word.charAt(i)=='l'){
                sum=sum+12;
            }if(word.charAt(i)=='M'| word.charAt(i)=='m'){
                sum=sum+13;
            }
            if(word.charAt(i)=='N'| word.charAt(i)=='n'){
                sum=sum+14;
            }
            if(word.charAt(i)=='O'| word.charAt(i)=='o'){
                sum=sum+15;
            }
            if(word.charAt(i)=='P'| word.charAt(i)=='p'){
                sum=sum+16;
            }
            if(word.charAt(i)=='Q'| word.charAt(i)=='q'){
                sum=sum+17;
            }
            if(word.charAt(i)=='R'| word.charAt(i)=='r'){
                sum=sum+18;
            }
            if(word.charAt(i)=='S'| word.charAt(i)=='s'){
                sum=sum+19;
            }
            if(word.charAt(i)=='T'| word.charAt(i)=='t'){
                sum=sum+20;
            }
            if(word.charAt(i)=='U'| word.charAt(i)=='u'){
                sum=sum+21;
            }
            if(word.charAt(i)=='V'| word.charAt(i)=='v'){
                sum=sum+22;
            }
            if(word.charAt(i)=='W'| word.charAt(i)=='w'){
                sum=sum+23;
            }
            if(word.charAt(i)=='X'| word.charAt(i)=='x'){
                sum=sum+24;
            }
            if(word.charAt(i)=='Y'| word.charAt(i)=='y'){
                sum=sum+25;
            }


        }
        System.out.println("your sum is: "+ sum);
    }

}
