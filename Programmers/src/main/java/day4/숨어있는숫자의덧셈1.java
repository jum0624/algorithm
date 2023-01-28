package day4;

import java.util.Arrays;

public class 숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        int answer = 0;
        int[] numList = Arrays.stream(my_string.replaceAll("[a-z|A-Z]", "").split("")).mapToInt(Integer::parseInt).toArray();
        for (int number : numList) {
            answer += number;
        }
        return answer;
    }

    public static void main(String[] args) {
        숨어있는숫자의덧셈1 sol = new 숨어있는숫자의덧셈1();
        System.out.println(sol.solution("aAb1B2cC34oOp"));
    }
}
