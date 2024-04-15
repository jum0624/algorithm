package 분할정복.boj_11582;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] numbers;
    static int[] tmp;
    static int n;
    static int k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        numbers = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i = i + (n/k)) {
            merge(i, i + n / k);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    static void merge(int start, int end) {
        tmp = new int[n / k];
        int idx = 0;
        for (int i = start; i < end; i++) {
            tmp[idx] = numbers[i];
            idx += 1;
        }
        Arrays.sort(tmp);
        idx = 0;
        for (int i = start; i < end; i++) {
            numbers[i] = tmp[idx];
            idx += 1;
        }
    }


}
