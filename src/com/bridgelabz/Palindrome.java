package com.bridgelabz;


public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.checkPalindromeString();
    }

    void checkPalindromeString(){
        String str = "Madam";
        String reverseStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str + "is a palindrome string");
        }
        else{
            System.out.println(str + "is not a palindrome string");
        }
    }
}
