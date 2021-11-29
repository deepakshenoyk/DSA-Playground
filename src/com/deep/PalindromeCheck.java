package com.deep;



public class PalindromeCheck {

    public static void main(String[] args) {

        String name = "malayalam";

        if(new StringBuffer(name).reverse().toString().equalsIgnoreCase(name)){
            System.out.println(name+" is a Palindrome");
        }
        else
            System.out.println(name+" is not a Palindrome");

    }
}
