package algorithm_challenge.day8;

public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int answer = 0;
        int keyX = dots[0][0];
        int keyY = dots[0][1];
        int row = 0;
        int high = 0;

        for (int i = 1; i < dots.length; i++) {
            if (dots[i][0] == keyX) {
                high = Math.abs(keyY - dots[i][1]);
            } else if (dots[i][1] == keyY) {
                row = Math.abs(keyX - dots[i][0]);
            }
        }

        answer = row * high;

        return answer;
    }

}
