package day3;

import java.util.Arrays;

public class 최댓값만들기1 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }

    public static void main(String[] args) {
        최댓값만들기1 sol = new 최댓값만들기1();
        System.out.println(sol.solution(new int[]{0, 31, 24, 10, 1, 9}));
    }
}
