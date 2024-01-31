package twoSum;

import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?


 */
public class TwoSum {



    public int[] testTwoSumDumbWay(int[] nums, int target){
    int sum = 0;
    int numsLenght = nums.length;
        for (int i = 0; i < numsLenght; i++) {
            for (int j = 1; j < numsLenght; j++) {
                sum = nums[i]+nums[j];
                if(sum == target && i != j){
                    return new int[]{i,j};
                }else{
                    sum = 0;
                }
            }
        }
        return null;
    }


    public int[] twoSumWithHashMap(int[] nums, int target) {
        int numsLenght = nums.length;

        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < numsLenght; i++) {
            numsMap.put(nums[i],i);
        }

        for (int i = 0; i < numsLenght; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(i) && numsMap.get(complement) != i) {
                return new int[]{i, numsMap.get(complement)};
            }
        }
        return new int[]{};
    }
}


