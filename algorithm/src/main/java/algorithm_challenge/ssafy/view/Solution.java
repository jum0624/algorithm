package algorithm_challenge.ssafy.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static boolean[][] map;
    static int[] floors;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int test_case = 1; test_case <= 10; test_case++) {
            result = 0;
            map = new boolean[1001][256];
            int n = Integer.parseInt(br.readLine());
            floors = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int h = Integer.parseInt(st.nextToken());
                if (h >= 0) {
                    floors[i] = h;
                    for (int j = 1; j <= h; j++) {
                        map[i][j] = true;
                    }
                }
            }
            for (int i = 1; i < floors.length; i++) {
                int floor = floors[i];
                for (int h = 1; h <= floor; h++) {
                    if (!map[i - 1][h] && !map[i - 2][h] && !map[i + 1][h] && !map[i + 2][h]) {
                        result += 1;
                    }
                }
            }
            System.out.printf("#%d %d\n", test_case, result);
        }
    }
}
