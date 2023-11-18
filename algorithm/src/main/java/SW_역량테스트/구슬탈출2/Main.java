package SW_역량테스트.구슬탈출2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static String[][] graph;
    static int[][] map;
    static int[][] map_blue;
    static boolean[][] visited_red;
    static boolean[][] visited_blue;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

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
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        graph = new String[row][column];
        map = new int[row][column];
        map_blue = new int[row][column];
        visited_red = new boolean[row][column];
        visited_blue = new boolean[row][column];
        int red_x = 0;
        int red_y = 0;
        int blue_x = 0;
        int blue_y = 0;
        int answer_x = 0;
        int answer_y = 0;

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                graph[i][j] = st.nextToken();
                if (graph[i][j].equals("R")) {
                    red_x = i;
                    red_y = j;
                }
                else if (graph[i][j].equals("B")) {
                    blue_x = i;
                    blue_y = j;
                }
                else if (graph[i][j].equals("0")) {
                    answer_x = i;
                    answer_y = j;
                }
                else if (graph[i][j].equals("#")) {
                    visited_red[i][j] = true;
                    visited_blue[i][j] = true;
                }
            }
        }

        Point point_red = new Point(red_x, red_y);
        visited_red[red_x][red_y] = true;

        Deque<Point> deque = new ArrayDeque();
        deque.add(point_red);
        while (!deque.isEmpty()) {
            Point poll = deque.poll();
            int point_x = poll.x;
            int point_y = poll.y;
            for (int i = 0; i < 4; i++) {
                int next_x = point_x + dx[i];
                int next_y = point_y + dy[i];
                while (graph[next_x][next_y].equals(".") && !visited_red[next_x][next_y]) {
                    
                }
            }
        }


    }
}
