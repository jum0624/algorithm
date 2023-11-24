package graph_traversal.boj_1260;

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
    static boolean[] index;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        index = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            map[start][end] = 1;
            map[end][start] = 1;
        }

        dfs(v);
        System.out.println();
        bfs(v);
    }

    static void bfs(int idx) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(idx);
        visited[idx] = true;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            System.out.print(poll + " ");
            for (int i = 1; i <= n ; i++) {
                if (map[poll][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    static void dfs(int idx) {
        index[idx] = true;
        System.out.print(idx + " ");
        for (int i = 1; i <= n; i++) {
            if (map[idx][i] == 1 && !index[i]) {
                dfs(i);
            }
        }
    }
}
