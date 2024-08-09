package stack.boj_2304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Point {
        int x;
        int y;  // 높이

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Stack<Point> stack = new Stack<>();
        List<Point> list = new ArrayList<>();

        for (int test_case = 1; test_case <= n; test_case++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x, y));
        }

        Collections.sort(list, (o1, o2) -> o1.x - o2.x);

        int s = 0;
        int max_height = 0;
        // 넣을 때, 넓이 구하기(앞에서 부터)
        for (int i = 0; i < list.size(); i++) {
            if (!stack.isEmpty()) {
                Point point = stack.peek();
                Point next = list.get(i);
                if (point.y <= next.y) {
                    int dx = next.x - point.x;
                    int dy = point.y;
                    s += (dx * dy);
                } else {
                    continue;
                }
            }
            if (max_height <= list.get(i).y) {
                max_height = list.get(i).y;
            }
            stack.push(list.get(i));
        }

        stack.clear();
        // 뺄 때, 넓이 구하기(뒤에서부터)
        for (int i = list.size()-1 ; i >= 0; i--) {
            if (!stack.isEmpty()) {
                Point point = stack.peek();
                Point next = list.get(i);
                if (point.y <= next.y) {
                    int dx = point.x - next.x;
                    int dy = point.y;
                    s += (dx * dy);
                } else {
                    continue;
                }
            }
            if (list.get(i).y >= max_height) {
                break;
            }
            stack.push(list.get(i));
        }

        // 가장 높은 높이 넓이 구하기
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int height = list.get(i).y;
            if (height >= max) {
                max = height;
            }
        }
        s += max;

        System.out.println(s);
    }
}
