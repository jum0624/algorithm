package day4;

public class 합성수찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int count = 0;
            // 약수 갯수 판별
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    count += 1;
                    if (j != i / 2) {
                        count += 1;
                    }
                }
            }
            if (count >= 3) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        합성수찾기 sol = new 합성수찾기();
        System.out.println("sol.solution(10) = " + sol.solution(15));

    }
}
