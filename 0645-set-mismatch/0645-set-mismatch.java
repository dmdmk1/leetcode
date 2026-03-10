class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];

        for(int num : nums) {
            count[num]++;
        }

        int[] answer = new int[2];
        for (int i = 1; i < count.length; i++) {
            if(count[i] == 2) {
                answer[0] = i;
            }

            if(count[i] == 0) {
                answer[1] = i;
            }
        }

        return answer;
    }
}