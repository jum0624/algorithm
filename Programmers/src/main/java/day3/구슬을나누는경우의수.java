package day3;

public class 구슬을나누는경우의수 {
    public long solution(int balls, int share) {
        long answer = 1;
        long k = balls;
        long j = 1;
        for (int i = 1; i <= share; i++) {
            answer = answer * k / j;
            k -= 1;
            j += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        구슬을나누는경우의수 sol = new 구슬을나누는경우의수();
        System.out.println(sol.solution(5,3));
    }
}
