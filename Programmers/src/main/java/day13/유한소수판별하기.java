package day13;

public class 유한소수판별하기 {
    public int solution(int a, int b) {
        int answer = 0;
        int gcd = gcd(a, b);
        int top = a % gcd;
        int bottom = b % gcd;
        if (top == 0 && bottom == 0) {
            bottom = b / gcd;
            while (bottom > 1) {
                if (bottom % 2 == 0) {
                    bottom /= 2;
                } else if (bottom % 5 == 0) {
                    bottom /= 5;
                } else {
                    break;
                }
            }
            if (bottom == 1) {
                answer = 1;
            } else {
                answer = 2;
            }
        }
        return answer;
    }

    public int gcd(int a, int b) {  // 최대공약수
        int i = a;
        int j = b;
        int tmp = i % j;
        while (tmp != 0) {
            i = j;
            j = tmp;
            tmp = i % j;
        }
        return j;
    }

    public static void main(String[] args) {
        유한소수판별하기 sol = new 유한소수판별하기();
        int solution = sol.solution(12, 21);
        System.out.println(solution);
    }
}
