package Day73;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {23, 12, -3, 1, 8, -3, 0, 90, 90};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums2 = {0};
        insertSort(nums2);
        System.out.println(Arrays.toString(nums2));
    }

    public static void insertSort(int[] nums) {
        if (nums == null || nums.length == 0) return;
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
