package dfs_bfs.boj_7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][][] map;
    static boolean[][][] visited;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static class Point {
        int day;
        int x;
        int y;
        int z;

        public Point(int day, int x, int y, int z) {
            this.day = day;
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        map = new int[h][n][m];
        visited = new boolean[h][n][m];

        Queue<Point> queue = new ArrayDeque();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());
                    if (map[i][j][k] == 1 || map[i][j][k] == -1) {
                        visited[i][j][k] = true;
                    }
                    if (map[i][j][k] == 1) {
                        queue.add(new Point(0, j, k, i));
                    }
                }
            }
        }

        int day = 0;
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            day = poll.day;
            for (int i = 0; i < 6; i++) {
                int next_x = poll.x + dx[i];
                int next_y = poll.y + dy[i];
                int next_z = poll.z + dz[i];
                int next_day = poll.day + 1;
                if (next_x >= 0 && next_x < n && next_y >= 0 && next_y < m && next_z >= 0 && next_z < h && !visited[next_z][next_x][next_y]) {
                    queue.add(new Point(next_day, next_x, next_y, next_z));
                    map[next_z][next_x][next_y] = 1;
                    visited[next_z][next_x][next_y] = true;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (map[i][j][k] == 0) {
                        day = -1;
                    }
                }
            }
        }

        System.out.println(day);
    }
}
