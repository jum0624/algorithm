package day25.달팽이_숫자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int[][] numbers;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            numbers = new int[n][n];
            visited = new boolean[n][n];
            int step = 0;
            int x = 0;
            int y = -1;
            int next_x = 0;
            int next_y = 0;
            for (int i = 1; i <= n * n; i++) {
                next_x = x + dx[step % 4];
                next_y = y + dy[step % 4];
                if (next_x < 0 || next_x >= n || next_y < 0 || next_y >= n || visited[next_x][next_y]) {
                    step += 1;
                    next_x = x + dx[step % 4];
                    next_y = y + dy[step % 4];
                }
                x = next_x;
                y = next_y;
                numbers[x][y] = i;
                visited[x][y] = true;
            }
            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
