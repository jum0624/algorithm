package dfs_bfs.boj_2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[][] visited;

    static class Node {
        int value;
        int count;

        public Node(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int member1 = Integer.parseInt(st.nextToken());
        int member2 = Integer.parseInt(st.nextToken());

        int members = Integer.parseInt(br.readLine());
        for (int test = 1; test <= members; test++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            visited[x][y] = true;
            visited[y][x] = true;
        }

        Deque<Node> deque = new ArrayDeque<>();
        Node node = new Node(member1, 1);
        deque.add(node);
        int result = -1;
        while (!deque.isEmpty()) {
            Node poll = deque.poll();
            int value = poll.value;
            int cnt = poll.count;
            for (int i = 1; i <= n; i++) {
                if (visited[value][i]) {
                    map[value][i] += cnt;
                    map[i][value] += cnt;
                    deque.add(new Node(i, cnt + 1));
                    visited[value][i] = false;
                    visited[i][value] = false;
                    if (i == member2) {
                        result = map[value][i];
                    }
                }
            }
        }
        System.out.println(result);
    }
}
