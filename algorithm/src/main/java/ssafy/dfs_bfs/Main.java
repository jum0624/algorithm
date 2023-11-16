package ssafy.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[][] map;
    static boolean[] visited;
    static boolean[] checked;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        map = new int[n + 1][n + 1];
        checked = new boolean[n + 1];
        for (int test_case = 0; test_case < m; test_case++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            map[i][j] = 1;
            map[j][i] = 1;
        }
        dfs(v);
        System.out.println();
        bfs(v);
    }

    static void bfs(int start) {
        visited = new boolean[n + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && map[poll][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
            System.out.print(poll + " ");
        }
    }

    static void dfs(int start) {
        checked[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i <= n; i++) {
            if (!checked[i] && map[start][i] == 1) {
                dfs(i);
            }
        }
    }
}
