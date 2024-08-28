package boj.boj_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution2 {
    static int[] arr;
    static int[] targets;
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        targets = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
            int low = lower_bound(targets[i]);
            int high = upper_bound(targets[i]);
            int d = high - low;
            sb.append(d + " ");
        }
        System.out.println(sb);
    }

    // 상한선
    static int upper_bound(int target) {
        int left = 0;
        int right = arr.length;
        int mid = (left + right) / 2;

        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] <= target) {  // target보다 큰 값 중에서 가장 앞에 있는 위치 찾기. 즉 arr[mid] > target
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // 하한선
    static int lower_bound(int target) {
        int left = 0;
        int right = arr.length;
        int mid = (left + right) / 2;

        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] < target) {  // target과 같거나 큰 수 중에서 가장 앞에 있는 위치. 즉 arr[mid] >= target
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
