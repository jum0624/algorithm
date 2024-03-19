package sw_역량테스트_준비.boj_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static boolean[] check;
    static int[] time;
    static int[] pay;
    static int total_price;
    static int max_price;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        check = new boolean[n + 1];
        time = new int[n + 1];
        pay = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            time[i] = t;
            pay[i] = p;
        }

        max_price = 0;
        for (int i = 1; i <= n; i++) {
            total_price = pay[i];
            dfs(i);
        }

        System.out.println(max_price);
    }

    static void dfs(int start) {
        int end_day = start + time[start] - 1; // 업무 끝나는 날
        if (end_day == n) {
            max_price = Math.max(total_price, max_price);
            return;
        }
        if (end_day > n) {
            max_price = Math.max(total_price - pay[start], max_price);
            return;
        }
        for (int i = end_day + 1; i <= n; i++) {
            total_price += pay[i];
            dfs(i);
            total_price -= pay[i];
        }
    }
}
