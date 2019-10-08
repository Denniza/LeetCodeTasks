package tasks.integerToRoman;

public class Solution {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(50));
        System.out.println(intToRoman(5));
        System.out.println(intToRoman(10));
        System.out.println(intToRoman(50));
        System.out.println(intToRoman(100));
        System.out.println(intToRoman(500));
        System.out.println(intToRoman(1000));
    }
    public static String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        while (num>=1000){
            builder.append("M");
            num-=1000;
        }
        if(num>899){
            builder.append("CM");
            num-=900;
        } else if (num>=500){
            builder.append("D");
            num-=500;
            while (num>=100){
                builder.append("C");
                num-=100;
            }
        } else if(num>399){
            builder.append("CD");
            num-=400;
        } else {
            while (num>99){
                builder.append("C");
                num-=100;
            }
        }
        if(num>89){
            builder.append("XC");
            num-=90;
        } else if (num>=50){
            builder.append("L");
            num-=50;
            while (num>=10){
                builder.append("X");
                num-=10;
            }
        } else if(num>39){
            builder.append("XL");
            num-=40;
        } else {
            while (num>9){
                builder.append("X");
                num-=10;
            }
        }
        if(num>8){
            builder.append("IX");
            return builder.toString();
        } else if (num>=5){
            builder.append("V");
            num-=5;
            while (num>0){
                builder.append("I");
                num-=1;
            }
        } else if(num>3){
            builder.append("IV");
        } else {
            while (num>0){
                builder.append("I");
                num-=1;
            }
        }
        return builder.toString();
    }
}
