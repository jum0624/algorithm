package dfs_bfs.boj_5014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int[] floor;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int present = Integer.parseInt(st.nextToken());
        int point = Integer.parseInt(st.nextToken());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());

        floor = new int[n + 1];
        visited = new boolean[n + 1];

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(present);
        visited[present] = true;
        while (!deque.isEmpty()) {
            Integer poll = deque.poll();
            int next_up = poll + up;
            int next_down = poll - down;
            if (next_up >= 1 && next_up <= n && !visited[next_up]) {
                floor[next_up] = floor[poll] + 1;
                deque.add(next_up);
                visited[next_up] = true;
            }
            if (next_down >= 1 && next_down <= n && !visited[next_down]) {
                floor[next_down] = floor[poll] + 1;
                deque.add(next_down);
                visited[next_down] = true;
            }
        }

        int result = floor[point];
        if (result == 0 && !visited[point]) {
            System.out.println("use the stairs");
        } else {
            System.out.println(result);
        }
    }
}
