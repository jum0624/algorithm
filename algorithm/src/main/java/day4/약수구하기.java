package day4;

import java.util.ArrayList;

public class 약수구하기 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        answer.add(n);
        return answer;
    }

    public static void main(String[] args) {
        약수구하기 sol = new 약수구하기();
        System.out.println(sol.solution(24));
    }
}
