package day2;

import java.util.stream.Stream;

public class 외계행성의나이 {
    public String solution(int age) {
        String answer = "";
        int[] arrNum = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < arrNum.length; i++) {
            int k = 97 + arrNum[i];
            char ch = (char) k;
            answer += ch;
        }
        return answer;
    }

    public static void main(String[] args) {
        외계행성의나이 sol = new 외계행성의나이();
        System.out.println(sol.solution(100));
    }
}
