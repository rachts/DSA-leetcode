class Solution {
    public int trap(int[] height) {
        if (height == null || height.length <= 2) return 0;

        int res = 0;
        int[] l = new int[height.length];
        l[0] = height[0];
        for (int i=1; i<height.length; i++) l[i] = Math.max(l[i-1], height[i]);

        int[] r = new int[height.length];
        r[height.length-1] = height[height.length-1];
        for (int i=height.length-2; i>=0; i--) r[i] = Math.max(r[i+1], height[i]);

        for (int i=1; i<height.length-1; i++) res += Math.min(l[i], r[i]) - height[i];

        return res;
    }
    }
