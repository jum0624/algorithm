package algorithm_challenge.day6;

public class 짝수와홀수 {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer += "Even";
        } else {
            answer += "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        짝수와홀수 sol = new 짝수와홀수();
        System.out.println(sol.solution(3));
    }

}
