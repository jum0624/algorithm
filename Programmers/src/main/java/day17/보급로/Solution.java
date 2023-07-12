package day17.보급로;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Solution
{
    static int[][] map;
    static int[][] dijkstra;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            map = new int[n][n];
            dijkstra = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dijkstra[i][j] = 9999;
                }
            }

            for (int i = 0; i < n; i++) {
                String next = sc.next();
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(String.valueOf(next.charAt(j)));
                }
            }

            int x = 0;
            int y = 0;
            Point point = new Point(x, y);
            Deque<Point> queue = new ArrayDeque<>();
            queue.add(point);
            dijkstra[x][y] = 0;
            while (!queue.isEmpty()) {
                Point p = queue.poll();
                for (int i = 0; i < 4; i++) {
                    x = p.x + dx[i];
                    y = p.y + dy[i];
                    if (x >= 0 && x < n && y >= 0 && y < n ) {
                        if (dijkstra[x][y] > map[x][y] + dijkstra[p.x][p.y]) {
                            queue.add(new Point(x, y));
                            dijkstra[x][y] = dijkstra[p.x][p.y] + map[x][y];
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(dijkstra[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("#" + test_case + " " + dijkstra[n - 1][n - 1]);

        }
    }
}