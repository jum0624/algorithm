package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class 영어가싫어요 {
    public long solution(String numbers) {
        long answer = 0;
        String replace = numbers;
        ArrayList<String> numberList = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
        for (String s : numberList) {
            if (replace.contains(s)) {
                int index = numberList.indexOf(s);
                replace = replace.replace(s, Integer.toString(index));
            }
        }
        answer = Long.parseLong(replace);
        return answer;
    }

    public static void main(String[] args) {
        영어가싫어요 sol = new 영어가싫어요();
        System.out.println(sol.solution("onefourzerosixseven"));
    }
}
