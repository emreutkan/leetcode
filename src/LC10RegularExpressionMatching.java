public class LC10RegularExpressionMatching {
   /* class Solution {
        public boolean isMatch(String s, String p) {
            boolean multiple = p.contains("*");
            boolean any = p.contains(".*");
            String strippedP = p.replaceAll("[*]", "");
            if(s.isEmpty()){
                return false;
            } else if (any) {
                return true;
            }
            if(!multiple && s.charAt(0)==strippedP.charAt(0) && s.charAt(1)!=strippedP.charAt(0)){
                return true;
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i)!=strippedP.charAt(0)){
                        return false;
                }
                return true;
            }
            }
            return false;
        }
    } */
}
