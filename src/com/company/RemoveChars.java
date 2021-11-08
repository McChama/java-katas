package com.company;

public class RemoveChars {
    /**
     * REMEMBER --- The first index of string is 0
     * Substring params
     *      beginIndex (include) = 1 -> In our new string, we include the next to 0 index
     *      endIndex (exclude) = str.length() - 1
     *          e.g.
     *              "eloquent".length = 8 -> But we wont want the last char
     *              "eloquent".length = 8 - 1 -> Decrease by one in order to exclude the last char
     * @param str
     * @return the new string
     */
    public static String remove(String str) {
        return str.substring(1, str.length()-1);
    }
}
