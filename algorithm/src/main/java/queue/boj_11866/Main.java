package queue.boj_11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] list = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            list[i] = i + 1;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        int point = -1;
        while (queue.size() != n) {
            int cnt = 0;
            while (cnt != k) {
                point = (point + 1) % n;
                if(!visited[point % n]) {
                    cnt += 1;
                }
            }
            queue.add(list[point]);
            visited[point] = true;
        }

        System.out.print("<");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll());
            if (queue.size() == 0) continue;
            System.out.print(", ");
        }
        System.out.print(">");

    }
}
