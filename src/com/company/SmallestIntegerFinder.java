package com.company;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int small = args[0];
        for (int number : args) small = Math.min(number, small);
        
        return small;
    }
}
