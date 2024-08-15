package boj.boj_1449;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] arr;

    static int n;
    static int l;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 1;
        Arrays.sort(arr);

        int start = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] >= start + l) {
                start = arr[i];
                cnt += 1;
            }
        }
        System.out.println(cnt);

    }
}
