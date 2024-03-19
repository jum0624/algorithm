package sw_역량테스트_준비.boj_14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] map;
    static boolean[] visited;
    static int[] choose;
    static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        choose = new int[n/2];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        min = 9999;
        dfs(0, 1);
        System.out.println(min);

    }

    private static void dfs(int idx, int start) {
        if (idx >= (n/2)) {
            diff();
            return;
        }
        for (int i = start; i <= n; i++) {
            if (!visited[i]) {
                choose[idx] = i;
                visited[i] = true;
                dfs(idx + 1, i + 1);
                visited[i] = false;
            }
        }
    }

    private static void diff() {
        int start_sum = 0;
        int link_sum = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (visited[i] && visited[j]) {
                    start_sum += map[i][j];
                    start_sum += map[j][i];
                }
                if (!visited[i] && !visited[j]) {
                    link_sum += map[i][j];
                    link_sum += map[j][i];
                }
            }
        }

        int d = Math.abs(start_sum - link_sum);
        min = Math.min(d, min);
    }
}
