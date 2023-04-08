package day13;

import java.util.Arrays;

public class 등수매기기 {

    public int[] solution(int[][] score) {
        int[] e = new int[score.length];
        int[] answer = new int[score.length];

        int cnt = 0;
        int max_index = -1;
        for (int i = 0; i < score.length; i++) {
            e[i] = score[i][0] + score[i][1];
        }

        int before = -1;
        for (int i = 1; i <= score.length; i++) {
            int max = -1;
            for (int j = 0; j < score.length; j++) {
                if (max <= e[j]) {
                    max = e[j];
                    max_index = j;
                }
            }
            if (before == max) {
                cnt += 1;
                answer[max_index] = i - cnt;
            } else {
                cnt = 0;
                answer[max_index] = i;
            }
            before = max;
            e[max_index] = -1;

        }
        return answer;
    }

    public static void main(String[] args) {
        등수매기기 sol = new 등수매기기();
        int[] solution = sol.solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}});
        System.out.println(Arrays.toString(solution));
    }
}
