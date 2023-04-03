package day12;

import java.util.ArrayList;

public class 제일작은수제거하기 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = 9999;
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer.add(arr[i]);
            }
        }
        if (answer.size() == 0) {
            answer.add(-1);
        }
        return answer;
    }
}
