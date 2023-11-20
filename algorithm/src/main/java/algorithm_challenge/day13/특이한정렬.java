package algorithm_challenge.day13;

import java.util.Arrays;

public class 특이한정렬 {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int min_index = -1;
        for (int i = 0; i < numlist.length; i++) {
            int min = 9999;
            for (int j = 0; j < numlist.length; j++) {
                int d = Math.abs(n - numlist[j]);  // 절댓값으로 최솟값 찾기
                if (min > d) {
                    min = d;
                    min_index = j;
                } else if (min == d) {
                    if (numlist[min_index] <= numlist[j]) {
                        min = d;
                        min_index = j;
                    }
                }
            }
            answer[i] = numlist[min_index];
            numlist[min_index] = -9999;

        }
        return answer;
    }

    public static void main(String[] args) {
        특이한정렬 sol = new 특이한정렬();
//        int[] solution = sol.solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30);
        int[] solution = sol.solution(new int[]{600, 400, 300, 200, 700, 800, 100, 900}, 500);
        System.out.println(Arrays.toString(solution));
    }
}
