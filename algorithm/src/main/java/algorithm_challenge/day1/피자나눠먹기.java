package algorithm_challenge.day1;

public class 피자나눠먹기 {
    public int solution(int slice, int n) {
        int answer = 1;
        for (int i=1; i * slice < n; i++) {
            answer = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        피자나눠먹기 sol = new 피자나눠먹기();
        System.out.println(sol.solution(10,10));
    }
}
