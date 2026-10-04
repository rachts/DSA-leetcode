class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length();
        if (len <= 1) return 0;
        boolean[] valid = new boolean[len];
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i=0; i<len; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty())  {
                    int left = stack.pop();
                    valid[left] = true;
                    valid[i] = true;
                }
            }
        }
        
        int curr = 0;
        int max = 0;
        for (int i=0; i<len; i++) {
            if (valid[i]) {
                curr++;
            } else {
                max = Math.max(max, curr);
                curr = 0;
            }
        }
        return Math.max(max, curr);
    }
}