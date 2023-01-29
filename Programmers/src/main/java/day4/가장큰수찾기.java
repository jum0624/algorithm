package day4;

import java.util.Arrays;

public class 가장큰수찾기 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;

        return answer;
    }

    public static void main(String[] args) {
        가장큰수찾기 sol = new 가장큰수찾기();
        System.out.println(Arrays.toString(sol.solution(new int[]{9, 10, 11, 8})));
    }


}
