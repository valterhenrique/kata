public class TwoSum {

  public static void main(String[] args){
    int result[] = new Solution().twoSum(new int[]{2,7,11,15}, 9);
    System.out.println(result[0] + "," + result[1]);
  }
}

class Solution {
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums.length; j++){
        if (i != j){
          if ((nums[i] + nums[j]) == target){
            return new int[]{i,j};
          }
        }
      }
    }
    return new int[2];
  }
}


// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
// You may assume that each input would have exactly one solution.
//
// Example:
// Given nums = [2, 7, 11, 15], target = 9,
//
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
// UPDATE (2016/2/13):
// The return format had been changed to zero-based indices. Please read the above updated description carefully.
