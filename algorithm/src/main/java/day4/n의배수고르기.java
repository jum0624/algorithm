package day4;

import java.util.ArrayList;

public class n의배수고르기 {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                answer.add(num);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        n의배수고르기 sol = new n의배수고르기();

        System.out.println(sol.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
    }
}
