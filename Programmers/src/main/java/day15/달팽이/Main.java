package day15.달팽이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] matrix;
    static int[] point1 = {1, 0, -1, 0}; // 아래 오른쪽 위 왼쪽
    static int[] point2 = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int value = Integer.parseInt(br.readLine());

        matrix = new int[n][n];
        int count = n * n;
        int x = 0, y = 0;
        int k = 0;

        while (count != 0) {
            matrix[x][y] = count;
            if (matrix[x][y] == 0 && x < n - 1) {

            }
            x += point1[k % n];
            y += point2[k % n];

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] == 0);
            }
            System.out.println();
        }
    }
}
