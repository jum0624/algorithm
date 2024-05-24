package 백트래킹.boj_15665;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuffer sb;
    static int n;
    static int m;
    static int[] index;
    static int[] choice;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuffer();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        index = new int[n];
        choice = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            index[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(index);

        comb(0);

        System.out.println(sb);
    }

    private static void comb(int k) {
        if (k == m) {
            for (int num : choice
            ) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }
        int before = -1;
        for (int i = 0; i < n; i++) {
            if (index[i] != before) {
                choice[k] = index[i];
                comb(k + 1);
                before = index[i];
            }
        }
    }
}
