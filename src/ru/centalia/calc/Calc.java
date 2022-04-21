package ru.centalia.calc;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        char op;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first value");
        int x = getValue(in.nextInt());
        System.out.println("Enter second value");
        int y =  getValue(in.nextInt());
        System.out.println("Select operation");
        System.out.println("+" + " " + "-" + " " + "*" + " " + "/");

        op = in.next().charAt(0);

        switch(op){
            case '+':
                System.out.print(x + " " + "+" + " " + y + " " + "=" + " " + (x + y));
                break;
            case '-':
                System.out.print(x + " " + "-" + " " + y + " " + "=" + " " + (x - y));
                break;
            case '*':
                System.out.print(x + " " + "*" + " " + y + " " + "=" + " " + (x * y));
                break;
            case '/':
                System.out.print(x + " " + "/" + " " + y + " " + "=" + " " + (x / y));
                break;
        }
    }
    public static int getValue(int value){
        read(value);
        return value;
    }

    public static char getOps(char op){


        return op;
    }

    public static void read(final int x){
        Scanner in = new Scanner(System.in);
    }
}
