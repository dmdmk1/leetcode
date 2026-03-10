class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int s = 0;
        int e = 0;
        int max = 0;

        while (e < nums.length) {
            if (nums[e] == 0) {
                s = e + 1;
            }

            max = Math.max(max, e - s + 1);
            e++;
        }

        return max;
    }
}