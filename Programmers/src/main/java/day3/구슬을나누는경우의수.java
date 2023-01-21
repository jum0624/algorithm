package day3;

public class 구슬을나누는경우의수 {
    public long solution(int balls, int share) {
        float answer = 1;
        float k = balls;
        float j = share;
        for (int i = 1; i <= share; i++) {
            answer *= k;
            k -= 1;
            answer /= j;
            j = j - 1;
        }
        return (long)answer;
    }

    public static void main(String[] args) {
        구슬을나누는경우의수 sol = new 구슬을나누는경우의수();
        System.out.println(sol.solution(6,2));
    }
}
