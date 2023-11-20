package algorithm_challenge.day8;

public class 저주의숫자3 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += 1;
            while (isTrue(answer)) {
                answer += 1;
            }
            System.out.println(answer);
        }
        return answer;
    }

    public boolean isTrue(int n) {
        return n % 3 == 0 || n % 10 == 3 || n / 10 == 3 || n / 10 == 13;
    }

    public static void main(String[] args) {
        저주의숫자3 sol = new 저주의숫자3();
        System.out.println(sol.solution(40));
    }
}
