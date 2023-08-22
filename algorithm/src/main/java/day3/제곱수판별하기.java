package day3;

public class 제곱수판별하기 {
    public int solution(int n) {
        int answer = 2;
        double result = Math.sqrt(n);
        if ((result - (int) result) == 0) {
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        제곱수판별하기 sol = new 제곱수판별하기();
        int solution = sol.solution(23472948);
        System.out.println("solution = " + solution);
    }
}
