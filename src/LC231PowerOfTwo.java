public class LC231PowerOfTwo {
    class Solution {
        public boolean isPowerOfTwo(double n) {
            if (n == 2 || n==1)return true;
            return n < 2 ? false:isPowerOfTwo(n/2);
        }
    }
}
