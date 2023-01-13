package day2;

import java.util.ArrayList;
import java.util.Arrays;

public class 진료순서정하기 {
    public int[] solution(int[] emergency) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i:emergency) {
            arrayList.add(i);
        }
        int[] answer = new int[emergency.length];
        int maxIndex = 0;
        for (int i = 1; i <= emergency.length; i++) {
            int maxValue = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j) > maxValue) {
                    maxValue = arrayList.get(j);
                    maxIndex = j;
                }
            }
            answer[maxIndex] = i;
            arrayList.set(maxIndex, 0);
        }
        return answer;
    }

    public static void main(String[] args) {
        진료순서정하기 sol = new 진료순서정하기();
        System.out.println(Arrays.toString(sol.solution(new int[]{3, 76, 24})));
    }
}
