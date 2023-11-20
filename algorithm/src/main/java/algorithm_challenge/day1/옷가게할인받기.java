package algorithm_challenge.day1;

public class 옷가게할인받기 {
    public int solution(int price) {
        int answer = 0;
        double sale = 0;
        if (price >= 500000) {
            sale = price*0.2;
        } else if (price >= 300000) {
            sale = price*0.1;
        } else if (price >= 100000) {
            sale = price*0.05;
        }
        answer = (int)(price - sale);
        return answer;
    }

    public static void main(String[] args) {
        옷가게할인받기 sol = new 옷가게할인받기();
        System.out.println(sol.solution(100000));
        System.out.println(sol.solution(580000));
    }
}
