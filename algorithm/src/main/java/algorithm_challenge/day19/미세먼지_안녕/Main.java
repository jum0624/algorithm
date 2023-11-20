package algorithm_challenge.day19.미세먼지_안녕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static int[][] map;
    static boolean[][] visited;

    static int sum = 0;

    static Point[] air_clean = new Point[2];

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        graph = new int[r][c];

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int T = 0; T < t; T++) {
            map = new int[r][c];
            visited = new boolean[r][c];

            int count = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (graph[i][j] == -1 && count < 2) {
                        visited[i][j] = true;
                        map[i][j] = -1;
                        air_clean[count] = new Point(i, j);
                        count += 1;
                    }
                }
            }
            // 1. 미세먼지 확산
            int x = 0;
            int y = 0;

            Deque<Point> deque = new ArrayDeque();
            deque.add(new Point(x, y));
            visited[x][y] = true;

            while (!deque.isEmpty()) {
                Point poll = deque.poll();
                x = poll.x;
                y = poll.y;
                int pre_smoke = graph[x][y];
                for (int i = 0; i < 4; i++) {
                    int next_x = x + dx[i];
                    int next_y = y + dy[i];
                    if (map[x][y] != -1 && next_x >= 0 && next_x < r && next_y >= 0 && next_y < c && graph[next_x][next_y] != -1) {
                        map[next_x][next_y] += (graph[x][y] / 5);
                        pre_smoke -= (graph[x][y] / 5);
                        if (!visited[next_x][next_y]) {
                            deque.add(new Point(next_x, next_y));
                            visited[next_x][next_y] = true;
                        }
                    }
                }
                map[x][y] += pre_smoke;
            }

            // 2. 공기청정기 작동 & 순환

            int x1 = air_clean[0].x - 1;
            int y1 = air_clean[0].y;
            int x2 = air_clean[1].x + 1;
            int y2 = air_clean[1].y;


            while (map[x1][y1] != -1) {
                int next_x1 = x1;
                int next_y1 = y1;

                if (x1 > 0 && y1 == 0) {
                    next_x1 = x1 + dx[0];
                    next_y1 = y1 + dy[0];
                }

                else if (x1 == 0 && y1 < c - 1) {
                    next_x1 = x1 + dx[1];
                    next_y1 = y1 + dy[1];

                }

                else if (x1 < air_clean[0].x && y1 == c - 1) {
                    next_x1 = x1 + dx[2];
                    next_y1 = y1 + dy[2];

                }

                else if (x1 == air_clean[0].x && y1 > 0) {
                    next_x1 = x1 + dx[3];
                    next_y1 = y1 + dy[3];

                }
                map[x1][y1] = map[next_x1][next_y1];
                if (map[next_x1][next_y1] == -1) {
                    map[x1][y1] = 0;
                }
                x1 = next_x1;
                y1 = next_y1;
            }

            while (map[x2][y2] != -1) {
                int next_x2 = x2;
                int next_y2 = y2;

                if (x2 < r - 1 && y2 == 0) {
                    next_x2 = x2 + dx[2];
                    next_y2 = y2 + dy[2];
                }
                else if (x2 == r - 1 && y2 < c - 1) {
                    next_x2 = x2 + dx[1];
                    next_y2 = y2 + dy[1];
                }
                else if (x2 > air_clean[1].x && y2 == c - 1) {
                    next_x2 = x2 + dx[0];
                    next_y2 = y2 + dy[0];
                }
                else if (x2 == air_clean[1].x && y2 > 0) {
                    next_x2 = x2 + dx[3];
                    next_y2 = y2 + dy[3];
                }

                map[x2][y2] = map[next_x2][next_y2];
                if (map[next_x2][next_y2] == -1) {
                    map[x2][y2] = 0;
                }
                x2 = next_x2;
                y2 = next_y2;
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    graph[i][j] = map[i][j];
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(map[i][j] != -1) {
                    sum += map[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
