package algorithm_challenge.day14;

import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        for (int i : arr
        ) {
            if (stack.size() == 0 || stack.peek() != i) {
                stack.push(i);
            }
        }
        answer = new int[stack.size()];

        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
