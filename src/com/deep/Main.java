package com.deep;

public class Main {

    public static void main(String[] args) {
        String word = "121";

        StringBuilder builder = new StringBuilder();

        builder.append(word);

        String reversedWord=builder.reverse().toString();

        if(word.equalsIgnoreCase(reversedWord)){
            System.out.println(word+" is Palindrome");
        }

        else
            System.out.println(word+" is not a Palindrome");


    }
}
