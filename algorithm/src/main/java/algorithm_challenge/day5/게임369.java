package algorithm_challenge.day5;

public class 게임369 {
    public int solution(int order) {
        int answer = 0;
        int k = order;
        while (k > 0) {
            if (k % 10 == 3 || k % 10 == 6 || k % 10 == 9) {
                ++answer;
            }
            k = k / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        게임369 sol = new 게임369();
        System.out.println(sol.solution(29423));
    }
}
