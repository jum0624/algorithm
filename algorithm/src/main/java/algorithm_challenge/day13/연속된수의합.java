package algorithm_challenge.day13;

public class 연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int[] numList = new int[1000];
        int sum = 0;
        for (int i = 0; i < numList.length; i++) {
            numList[i] = i - 1;
        }

        for (int i = 0; i < numList.length - num; i++) {
            answer = new int[num];
            sum = 0;
            for (int j = 0; j < num; j++) {
                answer[j] = numList[i + j];
                sum += numList[i + j];
            }
            if (sum == total) break;
        }
        return answer;
    }

}
