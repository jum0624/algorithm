package algorithm_challenge.day5;

import java.util.Arrays;

public class 최댓값만들기2 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int max = numbers[0] * numbers[numbers.length - 1];

        for (int i = 0; i < numbers.length - 1; i++) {
            answer = numbers[i] * numbers[i + 1];
            if (answer >= max) {
                max = answer;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        최댓값만들기2 sol = new 최댓값만들기2();
        System.out.println(sol.solution(new int[]{1, 2, -3, 4, -5}));
    }
}
