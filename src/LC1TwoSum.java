import java.util.Arrays;

public class LC1TwoSum {
    public static class P1TwoSum {
        public static class Solution {
            public int[] twoSum(int[] nums, int target) {
                for (int i = 0; i < nums.length; i++) {
                    for (int j = 0; j < i; j++) {
                        if (nums[i]+nums[j] == target){
                            return new int[]{i, j};
                        }
                    }
                }
                return null;
            }
        }
    }
    public static void main(String[] args) {
        int[] test1 = {2, 7, 11, 15};
        P1TwoSum.Solution Solution = new P1TwoSum.Solution();
        System.out.println(Arrays.toString(Solution.twoSum(test1, 9)));
    }
}
