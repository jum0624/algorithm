package day17.큰_수_구성하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int max;

    static int[] index;
    static int[] number;

    static void param(int k) {
        if(k > n) return;
        if (max < k) {
            max = k;
        }
        for (int i = index.length - 1; i >= 0; i--) {
            param(k * 10 + number[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        number = new int[m];
        index = new int[m];

        for (int i = 0; i < m; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        param(0);
        System.out.println(max);

    }
}
