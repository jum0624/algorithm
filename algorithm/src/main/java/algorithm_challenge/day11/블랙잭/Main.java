package algorithm_challenge.day11.블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] numbers;
    static int[] index = new int[3];    // 뽑은 3장의 카드
    static int sum = 0;
    static int k = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        comb(0, 0, m);
        System.out.println(k);
    }

    static void comb(int idx, int cnt, int max) {
        if (idx == index.length) {
            sum = 0;
            for (int i : index
            ) {
                sum += i;
            }
            if (sum <= max) {
                if (k < sum) {
                    k = sum;
                }
            }
            return;
        }
        for (int i = cnt; i < numbers.length; i++) {
            index[idx] = numbers[i];
            comb(idx + 1, i + 1, max);
        }
    }
}
