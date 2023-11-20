package algorithm_challenge.day1;

public class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;
        int service = 0;
        if (n >= 10) {
            service = (int)(n / 10);
        }
        answer = (n * 12000) + ((k - service) * 2000);
        return answer;
    }

    public static void main(String[] args) {
        양꼬치 sol = new 양꼬치();
        System.out.println(sol.solution(64, 6));
    }
}
