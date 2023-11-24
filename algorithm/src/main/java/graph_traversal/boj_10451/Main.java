package graph_traversal.boj_10451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int[][] map;
    static boolean[] visited;
    static int n;
    static int point_index;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            n = Integer.parseInt(br.readLine());
            map = new int[n + 1][n + 1];
            visited = new boolean[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int node = Integer.parseInt(st.nextToken());
                map[i][node] = 1;
            }

            count = 0;
            for (int i = 1; i <= n; i++) {
                point_index = i;
                dfs(point_index);
            }
            System.out.println(count);
        }
    }

    static void dfs(int idx) {
        visited[idx] = true;
        for (int i = 1; i <= n; i++) {
            if (map[idx][i] == 1) {
                if (i == point_index) {
                    count += 1;
                }
                if (!visited[i]) {
                    dfs(i);
                }
            }
        }
    }
}
