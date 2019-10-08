package tasks.longestSubstringWithoutRepeatingCharacters;

//Given a string, find the length of the longest substring without repeating characters.
//
//        Example 1:
//
//        Input: "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        char [] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int maxCount =1;
        int count = 1;
        for(int i=0; i<arr.length-1;i++){
            set.add(arr[i]);
            for(int j=i+1; j<arr.length; j++){

                if (set.contains(arr[j])) {
                    break;
                }
                count++;
                set.add(arr[j]);
            }
            if(count>maxCount) maxCount = count;
            count = 1;
            set.clear();
        }
        return maxCount;
    }
}
