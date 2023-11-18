package ssafy.파리퇴치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[][] map;
    static int[][] prefix;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            map = new int[n + 1][n + 1];
            prefix = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1] + map[i][j];
                }
            }

            int max = 0;
            for (int i = m; i <= n; i++) {
                for (int j = m; j <= n; j++) {
                    int sum = prefix[i][j] - prefix[i - m][j] - prefix[i][j - m] + prefix[i - m][j - m];
                    max = Math.max(sum, max);
                }
            }

            System.out.printf("#%d %d\n", test_case, max);
        }
    }
}
