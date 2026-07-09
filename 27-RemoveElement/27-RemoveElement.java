// Last updated: 7/9/2026, 10:07:53 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }

        return index;
    }
}