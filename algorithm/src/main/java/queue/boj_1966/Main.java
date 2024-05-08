package queue.boj_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Point {
        int priority;
        int index;

        public Point(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());  // 몇번째로 출력되는지 궁금한 숫자 인덱스

            Deque<Point> queue = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int priority = Integer.parseInt(st.nextToken());
               queue.add(new Point(priority, i));
            }

            int max_priority = 0;
            int count = 0;
            int result = 1;
            while (true) {
                while (count != n) {
                    Point poll = queue.poll();
                    if (max_priority < poll.priority) {
                        max_priority = poll.priority;
                        count = 0;
                    }
                    queue.add(poll);
                    count++;
                }
                Point max_poll = queue.poll();
                if (max_poll.index == target) {
                    System.out.println(result);
                    break;
                }
                result += 1;
                count = 0;
                max_priority = 0;
                n -= 1;
            }

        }
    }
}
