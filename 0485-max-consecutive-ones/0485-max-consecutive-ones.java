class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int s = 0;
        int e = 0;
        int max = 0;

        while (e < nums.length) {
            if (nums[e] == 1) {
                e++;
            } else {
                max = Math.max(max, e - s);
                s = e + 1;
                e = s;
            }
        }

        return Math.max(max, e - s);
    }
}