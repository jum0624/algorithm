package day5;

import java.util.Stack;

public class 중복된문자제거 {
    public String solution(String my_string) {
        String answer = "";
        Stack<String> stack = new Stack<>();

        for (String s : my_string.split("")
        ) {
            if (!stack.contains(s)) {
                stack.push(s);
            }
        }

        for (String str :stack) {
            answer += str;
        }
        return answer;
    }

    public static void main(String[] args) {
        중복된문자제거 sol = new 중복된문자제거();
        System.out.println(sol.solution("We are the world"));
    }
}
