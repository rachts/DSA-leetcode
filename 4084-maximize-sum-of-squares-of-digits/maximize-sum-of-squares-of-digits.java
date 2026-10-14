class Solution { 
    public String maxSumOfSquares(int num, int sum) { 
        if (sum > (num * 9)) return ""; 
        StringBuilder ans = new StringBuilder(); 
        for (int i = 0; i < sum / 9; i++) { 
            ans.append('9'); 
        } 
        int rem = sum % 9; 
        if (rem > 0) { 
            ans.append(rem); 
        }
        int rem_len = num - ans.length(); 
        for (int i = 0; i < rem_len; i++) { 
            ans.append('0'); 
        } 
        return ans.toString(); 
    } 
}
