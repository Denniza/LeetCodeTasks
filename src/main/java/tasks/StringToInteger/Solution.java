package tasks.StringToInteger;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("2147483648"));
        System.out.println(myAtoi("    0000000000000   "));
        System.out.println(myAtoi("20000000000000000000"));
        System.out.println(myAtoi("  0000000000012345678"));
        System.out.println(myAtoi("+"));
        System.out.println(myAtoi("     -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));

    }

    public static int myAtoi(String str) {
        str = str.trim();
        if(str.length()==0) return 0;
        int index = 0;
        boolean isNegative = false;
        long resultValue = 0;

            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                index++;
                isNegative= str.charAt(0) == '-';
            }
            while(index<str.length()) {
                if (!Character.isDigit(str.charAt(index))) break;

                resultValue = resultValue * 10 + (str.charAt(index++) - '0');
                if (resultValue*-1 < Integer.MIN_VALUE&&isNegative) return Integer.MIN_VALUE;
                if(resultValue > Integer.MAX_VALUE&&!isNegative) return Integer.MAX_VALUE;
            }
            return isNegative?(int)(resultValue*-1):(int)resultValue;
        }
    }
