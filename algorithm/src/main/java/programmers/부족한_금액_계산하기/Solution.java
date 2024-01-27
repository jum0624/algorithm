package programmers.부족한_금액_계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += (long) price * i;
        }
        if (money >= total) {
            answer = 0;
        }
        if (money < total) {
            answer = total - money;
        }
        return answer;
    }
}
