package dfs_bfs.boj_14503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 1;
    static int[][] map;
    static boolean[][] check;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n;
    static int m;

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
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        check = new boolean[n][m];

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    check[i][j] = true;
                }
            }
        }

        dfs(new Point(r, c), d);

        System.out.println(count);
    }

    static void dfs(Point point, int d) {
        map[point.x][point.y] = 1;
        boolean isCheck = false;
        for (int i = 1; i <= 4; i++) {
            int next_d = (d - i + 4) % 4;
            int next_r = point.x + dx[next_d];
            int next_c = point.y + dy[next_d];
            if (map[next_r][next_c] == 0 && next_r > 0 && next_r < n && next_c > 0 && next_c < m) {
                count += 1;
                map[next_r][next_c] = 1;
                isCheck = true;
                dfs(new Point(next_r, next_c), next_d);
                break;
            }
        }
        int next_d = (d - 2 + 4) % 4;
        int next_r = point.x + dx[next_d];
        int next_c = point.y + dy[next_d];
        if (!isCheck && next_r > 0 && next_r < n - 1 && next_c > 0 && next_c < m - 1 && !check[next_r][next_c]) {
            dfs(new Point(next_r, next_c), d);
        }
    }

}
