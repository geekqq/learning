package Day17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayRank {

    public static void main(String[] args) {
        int[] nums = {30,10,20,20,40};
        System.out.println(Arrays.toString(getArrayRank(nums)));

    }

    public static int[] getArrayRank(int[] nums) {
        //Create a copy of the given array, and sorted, and then put the element and the rank into a map
        int[] newArr = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(newArr);
        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
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
