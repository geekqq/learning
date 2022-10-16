package Day44;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetArrayRank {
    public static void main(String[] args) {
        int[] nums = {30,10,20};
        System.out.println(Arrays.toString(getArrayRank(nums)));
    }

    public static int[] getArrayRank(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        int[] newArr = Arrays.copyOfRange(nums, 0, nums.length);
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(newArr);
        int rank = 1;

        for (int i = 0; i < newArr.length; i++) {
            if (!map.containsKey(newArr[i])) {
                map.put(newArr[i], rank);
                rank++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
