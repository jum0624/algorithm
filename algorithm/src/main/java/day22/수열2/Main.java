package day22.수열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        list = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int max_cnt = 1;
        int max_up = 1;
        for (int i = 0; i < n - 1; i++) {
            if (list[i] <= list[i + 1]) {
                max_up += 1;
            }
            if (list[i] > list[i + 1]) {
                if (max_cnt < max_up) {
                    max_cnt = max_up;
                }
                max_up = 1;
            }
            max_cnt = Math.max(max_cnt, max_up);
        }

        int max_down = 1;
        for (int i = n - 1; i > 0; i--) {
            if (list[i] <= list[i - 1]) {
                max_down += 1;
            }
            if (list[i] > list[i - 1]) {
                if (max_cnt < max_down) {
                    max_cnt = max_down;
                }
                max_down = 1;
            }
            max_cnt = Math.max(max_cnt, max_down);
        }

        System.out.println(max_cnt);
    }
}
