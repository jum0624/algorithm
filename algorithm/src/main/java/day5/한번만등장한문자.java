package day5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 한번만등장한문자 {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        Arrays.sort(split);
        Set<String> set = new HashSet<>(Arrays.asList(split));
        for (String setString : set
        ) {
            long count = s.chars()
                    .filter(ch -> setString.equals(Character.toString(ch)))
                    .count();
            if (count == 1) {
                answer += setString;
            }
        }
        String[] answerSplit = answer.split("");
        Arrays.sort(answerSplit);
        String result ="";
        for (String str : answerSplit) {
            result += str;
        }

        return result;
    }

    public static void main(String[] args) {
        한번만등장한문자 sol = new 한번만등장한문자();
        System.out.println(sol.solution("hello"));
    }
}
