public class LC342PowerOfFour {
    class Solution {
        public boolean isPowerOfFour(double n) {
            if (n == 4 || n==1)return true;
            return n < 4 ? false:isPowerOfFour(n/4);
        }
    }
}
