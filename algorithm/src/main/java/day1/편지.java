package day1;

public class 편지 {

    public int solution(String message) {
        String[] split = message.split("");
        int answer = 0;
        answer = split.length * 2;
        return answer;
    }

    public static void main(String[] args) {
        편지 sol = new 편지();
        System.out.println(sol.solution("Happy Birthday!"));
    }
}
