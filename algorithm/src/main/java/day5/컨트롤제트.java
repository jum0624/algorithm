package day5;

import java.util.Stack;

public class 컨트롤제트 {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String s1 : s.split(" ")
        ) {
            if (s1.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(s1));
            }
        }

        for (Integer num : stack
        ) {
            answer += num;
        }
        return answer;
    }

    public static void main(String[] args) {
        컨트롤제트 sol = new 컨트롤제트();
        System.out.println(sol.solution("10 Z 20 Z 1"));
    }
}
