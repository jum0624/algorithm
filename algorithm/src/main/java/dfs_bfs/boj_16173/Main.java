package dfs_bfs.boj_16173;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] map;
    static int cnt;
    static boolean[][] visited;

    static Queue<Point> queue = new ArrayDeque<>();

    static String result = "Hing";

    // 오른쪽, 아래 순
    static int[] dx = {0, 1};
    static int[] dy = {1, 0};

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        queue.add(new Point(0, 0));
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            if (map[poll.x][poll.y] == -1) {
                result = "HaruHaru";
                break;
            }
            cnt = map[poll.x][poll.y];
            dfs(0, poll.x, poll.y);
        }

        System.out.println(result);
    }

    static void dfs(int idx, int x, int y) {
        if (idx == 1) {
            if (!visited[x][y]) {
                queue.add(new Point(x, y));
                visited[x][y] = true;
            }
            return;
        }
        for (int i = 0; i < 2; i++) {
            int next_x = x + (dx[i] * cnt);
            int next_y = y + (dy[i] * cnt);
            if (next_x >= 0 && next_x < n && next_y >= 0 && next_y < n) {
                dfs(idx + 1, next_x, next_y);
            }
        }
    }
}
