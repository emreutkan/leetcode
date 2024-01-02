import java.util.HashMap;

public class LC13RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumbers = new HashMap<Character, Integer>();
        romanNumbers.put('I',1);
        romanNumbers.put('V',5);
        romanNumbers.put('X',10);
        romanNumbers.put('L',50);
        romanNumbers.put('C',100);
        romanNumbers.put('D',500);
        romanNumbers.put('M',1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            while (i < s.length()-1 && romanNumbers.get(s.charAt(i+1))>romanNumbers.get(s.charAt(i))){
                int tempNum = romanNumbers.get(s.charAt(i+1))-romanNumbers.get(s.charAt(i));
                total += tempNum;
                i+=2;
            }
            if(i != s.length()) total += romanNumbers.get(s.charAt(i));
        }
        return total;
    }
}
