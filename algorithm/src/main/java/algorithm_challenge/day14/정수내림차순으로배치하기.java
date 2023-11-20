package algorithm_challenge.day14;

import java.util.ArrayList;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;
        String numbers = String.valueOf(n);
        ArrayList<Integer> arrayList = new ArrayList<>();

        String[] split = numbers.split("");
        for (String s : split
        ) {
            arrayList.add(Integer.parseInt(s));
        }
        Collections.sort(arrayList);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            answer *= 10;
            answer += arrayList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        정수내림차순으로배치하기 sol = new 정수내림차순으로배치하기();
        long solution = sol.solution(118372);
    }
}
