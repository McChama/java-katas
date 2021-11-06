package com.company;

public class SumOfNumbers {
    public int GetSum(int a, int b){
        /**
         * To achieve this exercise it's important to have
         * the idea of how mathematical summation works
         * Please check: https://www.youtube.com/watch?v=XJkIaw2e1Pw
          */
        int index = Math.min(a, b);
        int supIndex = Math.max(a, b);
        int sum = 0;

        for ( int i = index; i <= supIndex; i++ ) sum += i;
        return sum;
    }
}
