
// Runtime = 44 ms   **     Memory = 44.91 MB   ** bruteForce
package EasyProblemSolutions.TwoSum;
public class Solution {
    public static void main(String[] args) {
        int [] nums = {5,1,3,9,8,4};
        twoSum(nums , 9 );
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[0];
        for(int i = 0 ; i<nums.length ; i++ ){
            for (int j = i+1 ; j<nums.length ; j++){
                if(nums[i]+nums[j]==target){
                    result= new int[]{i, j};
                    return result;
                }
            }
        }
        return result;
    }
}
