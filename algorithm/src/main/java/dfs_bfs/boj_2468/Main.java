package dfs_bfs.boj_2468;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

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
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max_count = 0;

        for (int high = 0; high <= 100; high++) {
            visited = new boolean[n][n];
            // 비에 잠긴 영역 체크
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] <= high) {
                        visited[i][j] = true;
                    }
                }
            }

            Queue<Point> queue = new ArrayDeque<>();
            int count = 0;
            // 최대 안정 구역 영역의 갯수 카운트
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j]) {
                        count += 1;
                        queue.add(new Point(i, j));
                        visited[i][j] = true;
                    }
                    while (!queue.isEmpty()) {
                        Point poll = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int next_x = poll.x + dx[k];
                            int next_y = poll.y + dy[k];
                            if (next_x >= 0 && next_x < n && next_y >= 0 && next_y < n && !visited[next_x][next_y]) {
                                queue.add(new Point(next_x, next_y));
                                visited[next_x][next_y] = true;
                            }
                        }
                    }
                }
            }

            // 최대 영역 갯수로 업데이트
            max_count = Math.max(max_count, count);
        }
        System.out.println(max_count);
    }
}
