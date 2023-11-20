package algorithm_challenge.day20.색종이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map = new int[1001][1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            int column = Integer.parseInt(st.nextToken());

            for (int j = x; j < map.length; j++) {
                for (int k = y; k < map.length; k++) {
                    if (j >= x && j < x + row && k >= y && k < y + column) {
                        map[j][k] = i;
                    }
                }
            }
        }

        int result = 0;

        for (int k = 1; k <= n; k++) {
            result = 0;
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (map[i][j] == k) {
                        result += 1;
                    }
                }
            }
            System.out.println(result);
        }

    }
}
