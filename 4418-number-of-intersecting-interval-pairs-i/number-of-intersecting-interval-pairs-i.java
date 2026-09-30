class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        java.util.Arrays.sort(starts);
        java.util.Arrays.sort(ends);
        
        long ans = (long) n * (n - 1) / 2;
        int i = 0;
        for (int start : starts) {
            while (i < n && ends[i] < start) {
                i++;
            }
            ans -= i;
        }
        
        return (int) ans;
    }
}