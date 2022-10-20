package Day48;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {1,0,3,4,3,23,5};
        System.out.println(Arrays.toString(selectSort(nums)));
    }

    public static int[] selectSort(int[] nums) {
        int minIndex;
        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] >= nums[j]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
}
