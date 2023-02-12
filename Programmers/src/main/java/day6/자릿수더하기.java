package day6;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 sol = new 자릿수더하기();
        System.out.println(sol.solution(123));
    }
}
