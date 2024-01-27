package graph_traversal.boj_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static ArrayList<Integer> result = new ArrayList<>();

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
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(split[j]);
                if (map[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        Queue<Point> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    int cnt = 1;
                    queue.add(new Point(i, j));
                    visited[i][j] = true;
                    while (!queue.isEmpty()) {
                        Point poll = queue.poll();
                        int x = poll.x;
                        int y = poll.y;
                        for (int k = 0; k < 4; k++) {
                            int next_x = x + dx[k];
                            int next_y = y + dy[k];
                            if (next_x >= 0 && next_x < n && next_y >= 0 && next_y < n && !visited[next_x][next_y]) {
                                queue.add(new Point(next_x, next_y));
                                visited[next_x][next_y] = true;
                                cnt += 1;
                            }
                        }
                    }
                    result.add(cnt);
                }
            }
        }
        System.out.println(result.size());
        Collections.sort(result);
        result.forEach(System.out::println);
    }
}
