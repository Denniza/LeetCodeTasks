package tasks.zigZagConversion;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
//        And then read line by line: "PAHNAPLSIIGYIR"
//
//        Write the code that will take a string and make this conversion given a number of rows:
//
//        string convert(string s, int numRows);
//        Example 1:
//
//        Input: s = "PAYPALISHIRING", numRows = 3
//        Output: "PAHNAPLSIIGYIR"
//        Example 2:
//
//        Input: s = "PAYPALISHIRING", numRows = 4
//        Output: "PINALSIGYAHRPI"
//        Explanation:
//
//        P     I    N
//        A   L S  I G
//        Y A   H R
//        P     I

import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {

        System.out.println(convert("AB", 1));
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("PAYPALISHIRING", 4));
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if (s.isEmpty() || numRows <= 0) return "";
        if(numRows ==1) return s;
        StringBuilder result = new StringBuilder();
        HashMap<Integer, ArrayList<Character>> resultMap = new HashMap<>();
        Integer[] array = new Integer[numRows];
        initMap(numRows, resultMap, array);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count == numRows - 1) {
                count = 0;
                reverseArray(array);
            }
            resultMap.get(array[count]).add(s.charAt(i));
            count++;
        }
        for (int i = 0; i < resultMap.size(); i++) {
            for (Character a : resultMap.get(i)) {
                result.append(a);
            }
        }
        return result.toString();
    }

    private static void reverseArray(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
    }

    private static void initMap(int numb, HashMap<Integer, ArrayList<Character>> array,
                                Integer[] numbs) {
        {
            for (int i = 0; i < numb; i++) {
                array.put(i, new ArrayList<>());
                numbs[i] = i;
            }
        }
    }
}
