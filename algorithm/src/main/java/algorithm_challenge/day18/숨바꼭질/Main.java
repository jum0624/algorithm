package algorithm_challenge.day18.숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int[] map = new int[100001];
    static boolean[] visited = new boolean[100001];

    static int[] dx = {-1, 1, 2};

    static class Point {
        int x;

        public Point(int x) {
            this.x = x;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Point> deque = new ArrayDeque();
        int start = n;
        deque.add(new Point(start));
        visited[start] = true;
        while (!deque.isEmpty()) {
            Point poll = deque.poll();
            for (int i = 0; i < dx.length; i++) {
                int next = poll.x;
                if (dx[i] != 2) {
                    next = poll.x + dx[i];
                } else if (dx[i] == 2) {
                    next = poll.x * dx[i];
                }
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    map[next] = map[poll.x] + 1;
                    visited[next] = true;
                    deque.add(new Point(next));
                }
            }
        }
        System.out.println(map[k]);
    }
}
