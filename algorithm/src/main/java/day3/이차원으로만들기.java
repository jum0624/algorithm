package day3;

import java.util.Arrays;

public class 이차원으로만들기 {
    public int[][] solution(int[] num_list, int n) {
        int split = num_list.length / n;
        int[][] array = new int[split][n];
        int i = 0;
        while (i<num_list.length) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < n; k++) {
                    array[j][k] = num_list[i];
                    i = i + 1;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        이차원으로만들기 sol = new 이차원으로만들기();
        int[][] result = sol.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        System.out.println(Arrays.toString(result));
    }
}
