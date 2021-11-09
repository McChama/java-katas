package com.company;
import java.util.ArrayList;

public class RowSumOddNumbers {
    public static int sumArrayElements(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number : numbers)
            sum += number;
        return sum;
    }
    public static int rowSumOddNumbers(int rowsNumber) {
        int lastRowNumber = 1;
        ArrayList<Integer> lastRowNumbers = new ArrayList<>(1);

        for (int row=1; row<=rowsNumber; row++){
            lastRowNumbers.clear();
            for (int item = 1; item <= row; item++) {
                lastRowNumbers.add(lastRowNumber);
                lastRowNumber += 2;
            }
        }
        return sumArrayElements(lastRowNumbers);
    }
}
