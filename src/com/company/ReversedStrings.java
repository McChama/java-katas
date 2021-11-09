package com.company;

public class ReversedStrings {

    public static String iterationSolution(String str) {
        int len = str.length()-1;
        String myNewString = "";
        for (int i=len; i>0; i--)
            myNewString += str.charAt(i);
        return myNewString;
    }

    public static String stringBuilderSolution(String str){
        StringBuilder myNewString = new StringBuilder(str);
        return myNewString.reverse().toString();
    }
}
