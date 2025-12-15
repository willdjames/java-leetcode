// https://leetcode.com/problems/roman-to-integer/description/
static class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> vals = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int res = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Integer aChar = vals.get( chars[i] );
            Integer aChar1 = 0;
            if(i < chars.length-1) aChar1 = vals.get(chars[i + 1]);
            if(aChar < aChar1) {
                res = res + (aChar1 - aChar);
                i++;
            } else {
                res = res + aChar;
            }
        }
        return res;
    }
}


void main() {

	String case1 = "III";
	String case2 = "LVIII";
	String case3 = "MCMXCIV";

    Solution s = new Solution();
    int a = s.romanToInt(case1);
    assert a == 3 : "Teste falhou para III";
    int b = s.romanToInt(case2);
    assert b == 58 : "Teste falhou para LVIII";
    int c = s.romanToInt(case3);
    assert c == 1994 : "Teste falhou para MCMXCIV";
}
