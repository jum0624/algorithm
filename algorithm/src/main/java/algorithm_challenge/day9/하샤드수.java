package algorithm_challenge.day9;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int t = 0;
        int k = x;
        int sum = 0;
        while (k != 0) {
            t = k % 10;
            sum += t;
            k /= 10;
        }
        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }


        return answer;
    }
}
