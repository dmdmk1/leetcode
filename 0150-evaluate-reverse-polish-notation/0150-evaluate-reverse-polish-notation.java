class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        int left, right;

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    right = stack.pop();
                    left = stack.pop();

                    stack.push(left - right);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    right = stack.pop();
                    left = stack.pop();

                    stack.push(left / right);
                    break;
                default: // 숫자
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}