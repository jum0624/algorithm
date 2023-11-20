package algorithm_challenge.day9;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }

    public int gcd(int n, int m) {
        int a = n;
        int b = m;
        int tmp = a % b;

        while (a % b != 0) {
            a = b;
            b = tmp;
            tmp = a % b;
        }

        return b;
    }

    public int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }
}
