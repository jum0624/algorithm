package algorithm_challenge.day10;

import java.util.ArrayList;
import java.util.Collections;

public class 나누어떨어지는숫자배열 {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        Collections.sort(answer);
        if (answer.size() == 0) {
            answer.add(-1);
        }
        return answer;
    }
}
