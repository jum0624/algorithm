package day24.개미;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(br.readLine());

        int count_x = (x + t) / w;
        int count_y = (y + t) / h;
        int point_x = 0;
        int point_y = 0;

        if (count_x % 2 == 0) {
            point_x = (x + t) % w;
        }
        if (count_y % 2 == 0) {
            point_y = (y + t) % h;
        }
        if (count_x % 2 != 0) {
            point_x = (x + t) % w;
            point_x = w - point_x;
        }
        if (count_y % 2 != 0) {
            point_y = (y + t) % h;
            point_y = h - point_y;
        }

        System.out.println(point_x + " " + point_y);
    }
}
