class Solution {
    public boolean isMatch(String s, String p) {
     if (p.length() == 0) return s.length() == 0;
        Map<Integer, Boolean> memo = new HashMap<>();
        return isMatch(s.toCharArray(), 0, p.toCharArray(), 0, memo);
    }

    public boolean isMatch(char[] s, int i, char[] p, int j, Map<Integer, Boolean> memo) {
        int idx = i * p.length + j;
        if (memo.containsKey(idx)) return memo.get(idx);
        if (j == p.length) return i == s.length;

        boolean res = false;
        char pChar = p[j];
        if (i == s.length) {
            res = pChar == '*' && isMatch(s, i, p, j+1, memo);
        } else {
            char sChar = s[i];
            if (pChar == '?') {
                res = isMatch(s, i+1, p, j+1, memo);
            } else if (pChar == '*') {
                res = isMatch(s, i+1, p, j+1, memo) ||
                        isMatch(s, i, p, j+1, memo) ||
                        isMatch(s, i+1, p, j, memo);
            } else {
                res = pChar == sChar && isMatch(s, i+1, p, j+1, memo);
            }
        }
        memo.put(idx, res);
        return res;
    }

}