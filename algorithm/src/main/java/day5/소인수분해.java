package day5;

import java.util.ArrayList;

public class 소인수분해 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int tmp = n;

        for (int i = 2; i <= n; i++) {
            while (tmp % i == 0) {
                if (!answer.contains(i)) {
                    answer.add(i);
                }
                tmp = tmp / i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소인수분해 sol = new 소인수분해();
        System.out.println(sol.solution(420));
    }

}
