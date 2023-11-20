package algorithm_challenge.day25.경비원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static Point[] points;
    static long sum = 0;
    static int[] dx = {1, 0, -1, 0};
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
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());


        map = new int[w + 1][h + 1];
        int size = (2 * w) + (2 * h);

        int n = Integer.parseInt(br.readLine());
        points = new Point[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int direct = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if (direct == 1) {
                points[i] = new Point(k, 0);
            }
            if (direct == 2) {
                points[i] = new Point(k, h);
            }
            if (direct == 3) {
                points[i] = new Point(0, k);
            }
            if (direct == 4) {
                points[i] = new Point(w, k);
            }
        }

        st = new StringTokenizer(br.readLine());
        int direct_x = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int point_x = 0;
        int point_y = 0;
        int shift = 0;

        if (direct_x == 1) {
            point_x = x;
            point_y = 0;
            shift = 0;
        }
        if (direct_x == 2) {
            point_x = x;
            point_y = h;
            shift = 2;
        }
        if (direct_x == 3) {
            point_x = 0;
            point_y = x;
            shift = 3;
        }
        if (direct_x == 4) {
            point_x = w;
            point_y = x;
            shift = 1;
        }


        int init_x = point_x;
        int init_y = point_y;
        int init_shift = shift;
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i].x;
            int y1 = points[i].y;
            map[x1][y1] = 1;
            int count = 0;
            point_x = init_x;
            point_y = init_y;
            int next_x = 0;
            int next_y = 0;
            shift = init_shift;
            int index_count = 0;
            while (init_x != next_x || init_y != next_y) {
                next_x = point_x + dx[shift % 4];
                next_y = point_y + dy[shift % 4];
                if (next_x < 0 || next_x > w || next_y < 0 || next_y > h) {
                    shift += 1;
                    next_x = point_x + dx[shift % 4];
                    next_y = point_y + dy[shift % 4];
                }

                point_x = next_x;
                point_y = next_y;
                index_count += 1;

                if (index_count <= (size / 2)) {
                    count += 1;
                }
                if (index_count > (size / 2)) {
                    count -= 1;
                }
                if (map[point_x][point_y] == 1) {
                    break;
                }
            }

            if (init_x == next_x && init_y == next_y) {
                count = 0;
            }
            sum += count;
            map[x1][y1] = 0;
        }

        System.out.print(sum);
    }
}
