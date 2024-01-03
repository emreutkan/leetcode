public class LC76MinimumWindowSubstring {
    class Solution {
        public String minWindow(String s, String t) {
            int match = 0;
            int minMatch = s.length(); // just a big number it does not matter what we put it but since the s.length() would be tha max i set it like this
            int matchEndPoint = 0;
            int matchStartPoint = 0;


            String tempT = t;
            for (int i = 0; i < s.length(); i++) { // outer loop that will span the S
                for (int j = 0; j < tempT.length(); j++) { // inner loop that will span the T
                    if (s.charAt(i) == tempT.charAt(j)) { // this checks all the chars at T to match the given char at S
                        match++; // and it will increment the match
                        // exclude the matched char from t
                        StringBuilder sb = new StringBuilder(tempT);
                        sb.deleteCharAt(j);
                        tempT = sb.toString();
                    }
                }
                // ok so when the j is finished we would know if we had full match if match == t.length()-1;
                // if the match is found and the i is in position X then we would set that point as MatchEnd Point and the previous matchEndPoint would be our starting point
                if (match == t.length()-1) {
                    tempT = t; // reset the t to its original point
                    matchStartPoint = matchEndPoint;
                    matchEndPoint = i;
                    if (matchEndPoint - matchStartPoint < minMatch) {
                        minMatch = matchEndPoint - matchStartPoint;
                    }
                    match = 0; // we must reset the match so it will start over again
                }
            }

            // i set this in the first lines of the algorithm and if it still like this then we couldnt find any match so return ""
            return (minMatch == s.length()) ? "": s.substring(matchStartPoint,matchEndPoint);
        }
    }
}
