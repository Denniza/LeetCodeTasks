package tasks.reverseInteger;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        }

        public static int reverse(int i){
            if(i==0) return 0;
            while(i%10==0){
                i = i/10;
            }
            StringBuilder builder = new StringBuilder();
            int result;
            try {
                if (i < 0) {
                    builder.append(String.valueOf(i).substring(1));
                    result = Integer.parseInt(builder.reverse().toString()) * -1;
                } else {
                    builder.append(i);
                    result = Integer.parseInt(builder.reverse().toString());
                }
            } catch (NumberFormatException e){
                return 0;
            }

            return result;
        }
    }


