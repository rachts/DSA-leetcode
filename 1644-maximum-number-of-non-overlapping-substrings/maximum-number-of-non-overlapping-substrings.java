class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();

        // Store first and last occurrence of each character.
        int[][] intervals = new int[26][2];

        for (int i = 0; i < 26; i++) {
            intervals[i][0] = n;
            intervals[i][1] = -1;
        }

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            intervals[c][0] = Math.min(intervals[c][0], i);
            intervals[c][1] = i;
        }

        // Generate all valid intervals.
        List<int[]> candidates = new ArrayList<>();

        for (int c = 0; c < 26; c++) {
            if (intervals[c][1] == -1) {
                continue;
            }

            int left = intervals[c][0];
            int right = intervals[c][1];

            for (int i = left; i <= right; i++) {
                int current = s.charAt(i) - 'a';

                // This character starts before our current interval,
                // so this interval cannot be valid.
                if (intervals[current][0] < left) {
                    left = -1;
                    break;
                }

                right = Math.max(right, intervals[current][1]);
            }

            if (left != -1) {
                candidates.add(new int[]{left, right});
            }
        }

        // Choose intervals with the earliest ending position.
        candidates.sort((a, b) -> Integer.compare(a[1], b[1]));

        List<String> result = new ArrayList<>();
        int prevEnd = -1;

        for (int[] interval : candidates) {
            if (interval[0] > prevEnd) {
                result.add(s.substring(interval[0], interval[1] + 1));
                prevEnd = interval[1];
            }
        }

        return result;
    }
}