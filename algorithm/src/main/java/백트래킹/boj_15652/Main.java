package 백트래킹.boj_15652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[] choice;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        choice = new int[m];

        comb(1, 0);
        
        
    }

    static void comb(int idx, int k) {
        if (k == m) {
            for (int num : choice
            ) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        for (int i = idx; i <= n; i++) {
            choice[k] = i;
            comb(i, k + 1);
        }
    }
}
