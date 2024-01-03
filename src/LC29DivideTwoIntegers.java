import java.math.BigInteger;

public class LC29DivideTwoIntegers {
    class Solution {
        public int divide(int dividend, int divisor) {
            if (divisor == 0) return 0;
            if (dividend == -2147483648 && divisor == -1) dividend = -2147483647; // -2,147,483,648 to 2,147,483,647. so if max negative is divided to -1 we would get 2,147,483,648 which cant exist since its beyond limit
            return dividend/divisor;
        }
    }
}
