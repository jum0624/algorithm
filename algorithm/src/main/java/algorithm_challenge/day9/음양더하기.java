package algorithm_challenge.day9;

public class 음양더하기 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int k = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                k = absolutes[i];
            } else if (signs[i] == false) {
                k = -absolutes[i];
            }
            answer += k;
        }
        return answer;
    }

}
