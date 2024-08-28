package boj.boj_21735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[] an;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        an = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            an[i] = Integer.parseInt(st.nextToken());
        }

        int t = 0; // 현재 시간
        int snow = 1; // 눈 크기
        int i = 0; // 현재 위치
        while (t < m && i <= n - 4) {
            // 굴리기
            int tmp1_i = i + 1;  // 현재 위치 + 1
            int tmp1 = snow + an[tmp1_i + 1];  // 현재 위치에서 ai+1만큼 눈 크기 증가

            // 던지기
            int tmp2_i = i + 2; // 현재 위치 + 2
            int tmp_snow = snow / 2; // 눈크기 절
            int tmp2 = tmp_snow + an[tmp2_i + 2];
            if (tmp2_i + 2 <= n) {
                tmp2 = tmp_snow + an[tmp2_i + 2]; // 현재 위치에서 ai+2만큼 눈크기 증가
            }

//             둘 중 비교
            if (tmp1 < tmp2) {
                snow = tmp2;
                i = tmp2_i;
            } else {
                snow = tmp1;
                i = tmp1_i;
            }
            snow = tmp2;
            i = tmp2_i;
            t += 1;
        }

        System.out.println(snow);
    }
}
