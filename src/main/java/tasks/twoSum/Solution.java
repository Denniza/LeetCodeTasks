package tasks.twoSum;


//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        Example:
//
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].


public class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length;i++){
            for(int j=0; j<nums.length; j++){
                if (nums[i] + nums [j] == target&&i!=j) return new int []{i, j};
            }
        }
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("No such vales");
        }
        return null;
    }
}
