class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack = new Stack<>();
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (stack.size() != target.length) {
                stack.push(i);
                answer.add("Push");
            }

            for (int j = 0; j < stack.size(); j++) {
                if(stack.get(j) != target[j]) {
                    stack.pop();
                    answer.add("Pop");
                    break;
                }
            }
        }

        return answer;
    }
}