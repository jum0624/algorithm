package day4;

public class 팩토리얼 {
    public int factorial(int k) {
        if (k > 0) {
            return k * factorial(k-1);
        }
        return 1;
    }

    public int solution(int n) {
        int answer = 0;
        int result = 0;
        int i = 1;
        while(result < n){
            result = factorial(i);
            if (result > n) {
                answer = i-1;
                break;
            } else if (result == n) {
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        팩토리얼 sol = new 팩토리얼();
        System.out.println(sol.solution(7));
    }
}
