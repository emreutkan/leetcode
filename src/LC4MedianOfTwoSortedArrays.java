import java.util.ArrayList;
import java.util.Comparator;
public class LC4MedianOfTwoSortedArrays {

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            ArrayList<Integer> AL = new ArrayList<>();
            for (int i : nums1) {
                AL.add(i);
            }
            for (int i : nums2) {
                AL.add(i);
            }
            AL.sort(Comparator.naturalOrder());
            if (AL.isEmpty()){
                return 0.00;
            } else if (AL.size() ==1) {
                return AL.getFirst();
            }
            if (AL.size() % 2 == 0)
                return ((double)AL.get(AL.size()/2) + (double)AL.get(AL.size()/2-1))/2;
            else
                return ((double) AL.get((AL.size()-1)/2));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] TC1A = {1,3};
        int[] TC1B = {2};
        int[] TC2A = {1,2};
        int[] TC2B = {3,4};
        int[] TC3A = {1,3};
        int[] TC3B = {2,7};
        if (solution.findMedianSortedArrays(TC1A,TC1B) == 2.0){
            System.out.println("TC1 PASSED");
        }
        else {
            System.out.println("TC1 FAILED" + " " + solution.findMedianSortedArrays(TC1A,TC1B));
        }
        if (solution.findMedianSortedArrays(TC2A,TC2B) == 2.5){
            System.out.println("TC2 PASSED");
        }
        else {
            System.out.println("TC2 FAILED" + " " + solution.findMedianSortedArrays(TC2A,TC2B));
        }
        if (solution.findMedianSortedArrays(TC3A,TC3B) == 2.5){
            System.out.println("TC3 PASSED");
        }
        else {
            System.out.println("TC3 FAILED" + " " + solution.findMedianSortedArrays(TC3A,TC3B));
        }
    }
}
