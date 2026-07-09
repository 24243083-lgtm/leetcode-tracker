// Last updated: 7/9/2026, 10:08:11 AM
import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                if (sum < target) l++;
                else r--;
            }
        }

        return closest;
    }
}