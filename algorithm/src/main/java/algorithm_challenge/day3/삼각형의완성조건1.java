package algorithm_challenge.day3;

import java.util.Arrays;

public class 삼각형의완성조건1 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        int sides_sum = sides[0] + sides[1];
        if (sides_sum > sides[2]) {
            answer = 1;
        } else answer = 2;

        return answer;
    }

    public static void main(String[] args) {
        삼각형의완성조건1 sol = new 삼각형의완성조건1();
        System.out.println("sol = " + sol.solution(new int[]{1, 2, 3}));
    }
}
