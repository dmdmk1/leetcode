class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = prices.clone();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                answer[index] -= prices[i];
            }
            // 현재 인덱스를 스택에 저장 (나중에 할인받을 후보군)
            stack.push(i);
        }

        return answer;
    }
}