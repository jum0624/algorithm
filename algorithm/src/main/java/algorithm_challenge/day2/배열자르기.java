package algorithm_challenge.day2;

import java.util.Arrays;

public class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int[] arr = Arrays.copyOfRange(numbers, num1, num2+1);
        return arr;
    }

    public static void main(String[] args) {
        배열자르기 sol = new 배열자르기();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sol.solution(arr, 1, 3));
    }
}
