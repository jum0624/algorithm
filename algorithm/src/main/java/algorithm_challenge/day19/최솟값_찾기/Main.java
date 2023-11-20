package algorithm_challenge.day19.최솟값_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        nums = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 1; i <= n; i++) {
            queue.offer(new int[]{nums[i], i});
            while (!queue.isEmpty() && (i - queue.peek()[1]) >= l) {
                queue.poll();
            }
            if (!queue.isEmpty()) {
                System.out.print(queue.peek()[0] + " ");
            }
        }
    }
}
