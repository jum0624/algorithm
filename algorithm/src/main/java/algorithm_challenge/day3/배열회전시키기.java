package algorithm_challenge.day3;

public class 배열회전시키기 {

    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (direction.equals("left"))
                k = (i+1) % numbers.length;
            else if (direction.equals("right"))
                k = (i+ (numbers.length-1)) % numbers.length;

            answer[j] = numbers[k];
            j += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        배열회전시키기 sol = new 배열회전시키기();
        sol.solution(new int[]{1, 2, 3}, "right");
        sol.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left");
    }
}
