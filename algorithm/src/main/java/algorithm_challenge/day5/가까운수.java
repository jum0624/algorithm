package algorithm_challenge.day5;

import java.util.Arrays;

public class 가까운수 {
    public int solution(int[] array, int n) {
        int[] arr = array;
        Arrays.sort(arr);
        int answer = 0;
        int min = 100;
        for (int number : arr
        ) {
            int abs = Math.abs(number - n);
            if (min > abs) {
                min = abs;
                answer = number;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        가까운수 sol = new 가까운수();
        int solution = sol.solution(new int[]{3, 10, 28}, 20);
        System.out.println(solution);
    }
}
