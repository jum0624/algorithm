package boj.boj_6236;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int total = 0;
        arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
            max = Math.max(max, arr[i]);
        }

//        int low = max;
        int low = 0;
        int high = total;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;  // 오늘 쓸수 있는 금액
            int today = mid;
            int count = 1;
            int i = 0;
            while (i < n) {
                if (arr[i] > mid) {
                    count = m + 1;
                    break;
                } else {
                    if (today < arr[i]) {
                        today = mid;
                        count += 1;
                    }
                    today = today - arr[i];
                }
                i += 1;
            }
            if (count > m) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println(low);
    }
}
