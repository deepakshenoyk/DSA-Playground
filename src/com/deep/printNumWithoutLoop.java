package com.deep;

public class printNumWithoutLoop {

    public static void main(String[] args){

        printNumber(1);

        System.out.println("Second method");

        printNumber(3,120);

    }

    public static void printNumber(int num){

        if(num<=100){
            System.out.println(num);
            num++;
            printNumber(num);
        }

    }

    public static void printNumber(int inVal, int finVal){
        if(inVal<=finVal){
            System.out.println(inVal);
            inVal++;
            printNumber(inVal,finVal);
        }

    }

}
