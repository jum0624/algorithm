package algorithm_challenge.day16.미로찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 위, 오, 아, 왼
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = s.charAt(j) - '0';
                if (graph[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        Deque<int[]> deque = new ArrayDeque();
        int x = 0;
        int y = 0;
        visited[x][y] = true;
        deque.add(new int[]{x, y});
        while (!deque.isEmpty()) {
            int[] v = deque.poll();
            int nowX = v[0];
            int nowY = v[1];
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) continue;
                if (graph[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    deque.add(new int[]{nextX,nextY});
                    visited[nextX][nextY] = true;
                    graph[nextX][nextY] = graph[nowX][nowY] + 1;
                }
            }
        }

        System.out.println(graph[n-1][m-1]);


    }
}
