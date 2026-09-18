class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        Integer sumClosest = Integer.MAX_VALUE;
        Integer diffClosest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int low = i + 1;
                int high = nums.length - 1;
                while (low < high) {
                    int tempSum  = nums[i] + nums[low] + nums[high];
                    if (tempSum == target) {
                        return tempSum;
                    }

                    boolean update = diffClosest > Math.abs(tempSum - target);
                    sumClosest = update ? tempSum : sumClosest;
                    diffClosest = update ? Math.abs(tempSum - target) : diffClosest;

                    if (tempSum < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return sumClosest;
    }
}