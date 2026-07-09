// Last updated: 7/9/2026, 10:07:43 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            findFirst(nums, target),
            findLast(nums, target)
        };
    }

    private int findFirst(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] >= target) r = mid - 1;
            else l = mid + 1;

            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] <= target) l = mid + 1;
            else r = mid - 1;

            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }
}