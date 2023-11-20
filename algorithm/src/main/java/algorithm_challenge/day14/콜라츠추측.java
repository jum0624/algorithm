package algorithm_challenge.day14;

public class 콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        long k = num;
        while (k != 1 && answer <= 500) {
            if (k % 2 == 0) {
                k = k / 2;
            } else {
                k = 3 * k + 1;
            }
            answer += 1;
        }
        if (answer >= 500) {
            return -1;
        }
        if (num == 1) {
            return 0;
        }
        return answer;
    }
}
