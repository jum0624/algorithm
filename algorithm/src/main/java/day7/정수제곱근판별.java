package day7;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (int) Math.sqrt(n);
        if (n == sqrt * sqrt) {
            answer = (sqrt + 1) * (sqrt + 1);
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        정수제곱근판별 sol = new 정수제곱근판별();
        System.out.println(sol.solution(121));

    }
}
