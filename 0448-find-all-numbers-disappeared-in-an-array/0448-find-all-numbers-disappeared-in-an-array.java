class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] count = new int[nums.length + 1];

        for (int num : nums) {
            count[num]++;
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                answer.add(i);
            }
        }

        return answer;
    }
}