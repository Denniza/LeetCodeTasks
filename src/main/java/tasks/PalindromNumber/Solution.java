package tasks.PalindromNumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(0));
    }
    public static boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        if (value.isEmpty()) return false;
        if(value.length()==1) return true;
        boolean result= true;
        int left, right;
        if (value.length()%2==0){
            right=(value.length()/2);
            left=right-1;}
        else {
            right=(value.length()+1)/2;
            left=right-2;}
        while (true){
            if(value.charAt(left)!=value.charAt(right)){
                result =false;
                break;}
            left--;
            right++;
            if(left<0||right> value.length()) break;
            }
        return result;
    }
}
