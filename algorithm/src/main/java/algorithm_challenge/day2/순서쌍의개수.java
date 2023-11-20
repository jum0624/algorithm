package algorithm_challenge.day2;

public class 순서쌍의개수 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        순서쌍의개수 sol = new 순서쌍의개수();
        System.out.println(sol.solution(100));
    }
}
