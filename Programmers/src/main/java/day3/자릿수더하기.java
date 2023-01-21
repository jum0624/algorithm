package day3;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        int k = 10;
        StringBuffer sb = new StringBuffer();
        sb.append(n);
        for (int i = 0; i < sb.length(); i++) {
            answer += n % k;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 sol = new 자릿수더하기();
        int result = sol.solution(930211);
        System.out.println(result);
    }
}
