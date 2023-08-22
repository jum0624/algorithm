package day6;

public class 약수의합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        answer += n;
        return answer;
    }

    public static void main(String[] args) {
        약수의합 sol = new 약수의합();
        System.out.println(sol.solution(12));
    }
}
