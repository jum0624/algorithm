package greedy.boj_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] money;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        money = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            money[i] = Integer.parseInt(br.readLine());
        }

        int i = 0;
        int cnt = 0;
        while (k != 0 && i < n) {
            if (k >= money[i]) {
                k -= money[i];
                cnt += 1;
            } else if (k < money[i]) {
                i += 1;
            }
        }
        System.out.println(cnt);
    }
}
