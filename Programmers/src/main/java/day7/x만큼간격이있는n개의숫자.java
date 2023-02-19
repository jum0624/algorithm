package day7;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long k = x;
        for (int i = 0; i < n; i++) {
            answer[i] = k;
            k += x;
        }
        return answer;
    }
}
