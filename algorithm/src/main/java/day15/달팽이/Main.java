package day15.달팽이;

import java.io.*;

public class Main {
    static int[][] matrix;
    static int[] point1 = {1, 0, -1, 0}; // 아래 오른쪽 위 왼쪽
    static int[] point2 = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int value = Integer.parseInt(br.readLine());

        matrix = new int[n][n];
        int count = n * n;
        int tmp_x = 0, tmp_y = 0;
        int point_x = 0, point_y = 0;
        int x = 0, y = 0;
        int k = 0;

        while (count != 0) {
            if (x < 0 || x >= n || y < 0 || y >= n || matrix[x][y] != 0) {
                x = tmp_x;
                y = tmp_y;
                k += 1;
                count += 1;
            }
            matrix[x][y] = count;
            if (count == value) {
                point_x = x + 1;
                point_y = y + 1;
            }
            tmp_x = x;
            tmp_y = y;
            x += point1[k % 4];
            y += point2[k % 4];
            count -= 1;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                bw.write(String.valueOf(matrix[i][j]));
                bw.write(" ");
            }
            bw.write("\n");
        }
        bw.write(point_x + " " + point_y);
        bw.flush();
    }
}
