class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;

        for (String log : logs) {
            String[] split = log.split(":");

            int id = Integer.parseInt(split[0]);
            String type = split[1];
            int time = Integer.parseInt(split[2]);

            if (type.equals("start")) {
                if (!stack.isEmpty()) {
                    answer[stack.peek()] += time - prevTime;
                }

                stack.push(id);
                prevTime = time;
            } else {
                answer[stack.pop()] += time - prevTime + 1;
                prevTime = time + 1;
            }
        }

        return answer;
    }
}