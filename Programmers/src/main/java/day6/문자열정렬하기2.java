package day6;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 문자열정렬하기2 {
    public String solution(String my_string) {
        String answer = "";

        Stream<String> sorted = Arrays.stream(my_string.toLowerCase().split(""))
                .sorted();

        answer = sorted.collect(Collectors.joining());

        return answer;
    }

    public static void main(String[] args) {
        문자열정렬하기2 sol = new 문자열정렬하기2();
        System.out.println(sol.solution("Bcad"));
    }
}
