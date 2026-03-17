class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack = new Stack<>();
        List<String> answer = new ArrayList<>();

        int i = 1;
        int targetIndex = 0;

        while(i <= n && targetIndex < target.length) {
            stack.push(i);
            answer.add("Push");

            if(stack.peek() == target[targetIndex]) {
                targetIndex++;
            } else {
                stack.pop();
                answer.add("Pop");
            }

            i++;
        }

        return answer;
    }
}