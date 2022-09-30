package Day11;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "helloxs!@";
        System.out.println(getLengthOfLongestSubstring(s));
    }

    public static int getLengthOfLongestSubstring(String s) {
        //Using set
        int left = 0, right = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (set.add(c)) {
                maxLength = Math.max(maxLength, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
