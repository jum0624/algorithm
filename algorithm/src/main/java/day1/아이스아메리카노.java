package day1;

import java.util.Arrays;

public class 아이스아메리카노 {
    public int[] solution(int money) {
        int coffee = 0;
        int[] answer = {coffee, money};

        while (answer[1] >= 5500) {
            answer[0] = ++coffee;
            answer[1] -= 5500;
        }
        return answer;
    }

    public static void main(String[] args) {
        아이스아메리카노 sol = new 아이스아메리카노();
        System.out.println(Arrays.toString(sol.solution(5500)));

    }
}
