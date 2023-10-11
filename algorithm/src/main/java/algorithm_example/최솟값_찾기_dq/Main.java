package algorithm_example.최솟값_찾기_dq;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            while (!deque.isEmpty() && deque.peekLast()[0] > key) {
                deque.pollLast();
            }
            deque.add(new int[]{key, i});
            if (deque.peek()[1] < i - l + 1) {
                deque.poll();
            }
            bw.write(deque.peek()[0] + " ");
        }
        bw.flush();
        bw.close();
    }
}
