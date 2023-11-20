package algorithm_challenge.day4;

import java.util.ArrayList;
import java.util.Comparator;

public class 문자열정렬하기1 {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            int ascii = c;
            if (ascii >= 48 && ascii <= 57) {
                int num = c - 48;
                result.add(num);
            }
        }
        result.sort(Comparator.naturalOrder());
        return result;
    }

    public static void main(String[] args) {
        문자열정렬하기1 sol = new 문자열정렬하기1();
        System.out.println(sol.solution("abcde0"));
    }
}
