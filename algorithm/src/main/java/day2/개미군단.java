package day2;

public class 개미군단 {
    public int solution(int hp) {
        int answer = 0;
        int result = hp;

        int i = 5;
        int j = 2;
        while (i > 0) {
            answer += result / i;
            if (result % i != 0) {
                result = result % i;
            } else {
                break;
            }
            i = -2 * j + 7;
            j ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        개미군단 sol = new 개미군단();
        System.out.println(sol.solution(24));
    }
}
