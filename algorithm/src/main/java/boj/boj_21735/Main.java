package boj.boj_21735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[] an = new int[105];
    static int size;
    static int max_size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            an[i] = Integer.parseInt(st.nextToken());
        }

        max_size = 0;
        size = 1;
        int result = getSize(0, size, 0);

        System.out.println(result);

    }

    static int getSize(int idx, int size, int time) {
        if (idx >= n || time >= m) {
            return size;
        }
        int result1 = getSize(idx + 1, size + an[idx + 1], time + 1);// 눈 굴리기
        int result2 = getSize(idx + 2, (size / 2) + an[idx + 2], time + 1);// 눈 던지기
        return Math.max(result1, result2);
    }
}
