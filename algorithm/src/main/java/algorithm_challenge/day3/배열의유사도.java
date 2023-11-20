package algorithm_challenge.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(s2));
        for (String s : s1) {
            if (arrayList.contains(s)) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        배열의유사도 sol = new 배열의유사도();
        System.out.println(sol.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
    }
}
