
// Runtime = 2 ms   **     Memory = 44.87 MB   ** hashMap

package EasyProblemSolutions.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class EnhancedSolution {
    public static void main(String[] args) {
        int [] nums = {5,1,3,9,8,4};
        twoSum(nums , 9 );
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
