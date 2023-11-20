package algorithm_challenge.day8;

import java.util.HashSet;
import java.util.Set;

public class 삼각형의완성조건2 {
    public int solution(int[] sides) {
        int answer = 0;
        Set<Integer> store = new HashSet<>();
        int max = 0;
        int sum = 0;
        for (int i : sides
        ) {
            if (i >= max) {
                max = i;
            }
            sum += i;
        }

        // max가 가장 긴변일 때
        for (int k = 1; k <= max; k++) {
            if ((sum - max) + k > max) {
                store.add(k);
            }
        }

        // k가 가장 긴변일 때
        for (int k = max; k < sum ; k++) {
            store.add(k);
        }

        answer = store.size();
        return answer;
    }

    public static void main(String[] args) {
        삼각형의완성조건2 sol = new 삼각형의완성조건2();
        System.out.println(sol.solution(new int[]{1, 2}));
    }
}
