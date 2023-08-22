package day8;

public class 종이자르기 {
    public int solution(int M, int N) {
        int answer = 0;
        int max = M;
        int min = N;
        if (M < N) {
            max = N;
            min = M;
        }
        answer = (max - 1) + max * (min - 1);
        return answer;
    }

    public static void main(String[] args) {
        종이자르기 sol = new 종이자르기();
        System.out.println(sol.solution(1,1));
    }
}
