package main.java.com.dil.controlstatements.switchstatement;

import java.util.Random;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.println("Pick a number 1-5");
        int num=scanner.nextInt();
        Random random=new Random();
        char letter= (char) random.nextInt(3);

        switch (num){
            case 1:
                System.out.println("Water");
                switch (letter){
                    case 'a':
                        System.out.println("clear as water");
                        break;
                    case 'b':
                        System.out.println("deep as water");
                        break;
                    case 'c':
                        System.out.println("cool as water");
                    break;
                        default:
                        System.out.println("hide nature as water");
                }
                break;
            case 2:
                System.out.println("Earth");
                switch (letter){
                    case 'a':
                        System.out.println("hard as Earth");
                        break;
                    case 'b':
                        System.out.println("love as Earth");
                        break;
                    case 'c':
                        System.out.println("cool as Earth");
                        break;
                    default:
                        System.out.println("help as Earth");
                }
                break;
            case 3:
                System.out.println("Sky");
                switch (letter){
                    case 'a':
                        System.out.println("clear as sky");
                        break;
                    case 'b':
                        System.out.println("deep as sky");
                        break;
                    case 'c':
                        System.out.println("mysterious as sky");
                        break;
                    default:
                        System.out.println("big hearted as sky");
                }
                break;
            case 4:
                System.out.println("Lotus");
                switch (letter){
                    case 'a':
                        System.out.println("pure as lotus");
                        break;
                    case 'b':
                        System.out.println("beauty as lotus");
                        break;
                    case 'c':
                        System.out.println("care as pure lotus");
                        break;
                    default:
                        System.out.println("kind nature as lotus");
                }
                break;
            case 5:
                System.out.println("Wind");
                switch (letter){
                    case 'a':
                        System.out.println("fast as wind");
                        break;
                    case 'b':
                        System.out.println("deep as wind");
                        break;
                    case 'c':
                        System.out.println("feels as wnd");
                        break;
                    default:
                        System.out.println("hurt  as wind");
                }
                break;
        }
    }
}
