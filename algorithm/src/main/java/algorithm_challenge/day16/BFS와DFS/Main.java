package algorithm_challenge.day16.BFS와DFS;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static boolean[] checked;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int link = Integer.parseInt(st.nextToken());
        int start_node = Integer.parseInt(st.nextToken());

        graph = new int[node + 1][node + 1];
        checked = new boolean[node + 1];
        visited = new boolean[node + 1];

        for (int k = 0; k < link; k++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());
            graph[i][j] = 1;
            graph[j][i] = 1;
        }

        dfs(start_node);
        System.out.println();
        bfs(start_node);

    }

    public static void dfs(int start_node) {
        checked[start_node] = true;
        System.out.print(start_node + " ");
        for (int i = 1; i < checked.length; i++) {
            if (graph[start_node][i] == 1 && !checked[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start_node) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(start_node);
        while (!queue.isEmpty()) {
            Integer v = queue.poll();
            visited[v] = true;
            System.out.print(v + " ");
            for (int i = 1; i < visited.length; i++) {
                if (graph[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }
}
