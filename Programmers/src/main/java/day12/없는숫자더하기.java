package day12;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    answer -= i;
                }
            }
        }
        return answer;
    }

}
