package day3;

public class 공던지기 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        int j = 0;
        while (j < k) {
            answer = numbers[i % (numbers.length)];
            i += 2;
            j += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        공던지기 sol = new 공던지기();
        int result = sol.solution(new int[]{1, 2, 3}, 3);
        System.out.println("result = " + result);
    }
}
