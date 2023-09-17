package day22.수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        list = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        long max_tmp = -99999999;
        for (int i = 0; i <= n - k; i++) {
            long sum_tmp = 0;
            for (int j = i; j < i + k; j++) {
                sum_tmp += list[j];
            }
            if (sum_tmp > max_tmp) {
                max_tmp = sum_tmp;
            }
        }
        System.out.println(max_tmp);
    }
}
