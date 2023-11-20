package algorithm_challenge.day26.직사각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static String result = "";

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
        for (int test_case = 0; test_case < 4; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int p1 = Integer.parseInt(st.nextToken());
            int q1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            int q2 = Integer.parseInt(st.nextToken());

            if (x1 > p2 || p1 < x2 || y1 > q2 || q1 < y2) {
                result = "d";
            } else if ((x1 == p2 && y1 == q2) || (x1 == p2 && q1 == y2) || (p1 == x2 && y1 == q2) || (p1 == x2 && q1 == y2)) {
                result = "c";
            } else if ((x1 == p2 && q1 > y2) || (x1 < p2 && q1 == y2)
                    || (x1 == p2 && y1 < q2) || (x1 < p2 && y1 == q2)
                    || (p1 == x2 && y1 > q2) || (p1 > x2 && y1 == q2)
                    || (p1 == x2 && q1 > y2) || (p1 > x2 && q1 == y2)) {
                result = "b";
            }
            else {
                result = "a";
            }
            System.out.println(result);
        }

    }
}
