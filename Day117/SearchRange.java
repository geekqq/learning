package Day117;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,5,6,6,7};
        int n = 3;
        System.out.println(findLeftIndex(nums, n));
        System.out.println(findRightIndex(nums, n));
        System.out.println(Arrays.toString(searchRange(nums, n)));
    }
    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        int[] res = new int[2];
        res[0] = findLeftIndex(nums, target);
        res[1] = findRightIndex(nums, target);
        return res;
    }

    private static int findLeftIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }
    private static int findRightIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }
}
