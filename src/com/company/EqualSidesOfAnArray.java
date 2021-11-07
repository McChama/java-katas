package com.company;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int len = arr.length;
        int sumLeft = 0;
        int sumRight = 0;

        for (int i=0; i<len; i++){
            sumLeft = (i == 0) ? 0 : sumArrayElements(0, i, arr);
            sumRight = sumArrayElements(i+1, len, arr);
            if (sumLeft == sumRight)
                return i;
        }
        return -1;
    }

    public static int sumArrayElements(int index, int limit, int[] arr){
        int sum = 0;

        for (int i=index; i<limit; i++)
            sum += arr[i];

        return sum;
    }
}
