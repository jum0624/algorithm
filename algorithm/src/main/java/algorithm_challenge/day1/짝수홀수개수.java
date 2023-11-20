package algorithm_challenge.day1;

import java.util.Arrays;

public class 짝수홀수개수 {

    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        짝수홀수개수 sol = new 짝수홀수개수();
        System.out.println(Arrays.toString(sol.solution(new int[]{1,2,3,4,5})));
    }
}
