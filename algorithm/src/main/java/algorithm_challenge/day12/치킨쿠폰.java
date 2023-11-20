package algorithm_challenge.day12;

public class 치킨쿠폰 {
    public int solution(int chicken) {
        int answer = 0;  // 서비스 횟수
        int coupon = chicken;  // 쿠폰 갯수
        while (coupon >= 10) {
            int service = 0;
            answer += coupon / 10;
            service += coupon / 10;
            coupon = coupon % 10;
            coupon += service;
        }
        return answer;
    }
}
