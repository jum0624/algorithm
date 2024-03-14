package sw_역량테스트_준비.boj_13458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  // 응시 시험장 갯수
        int[] test_room = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(st.nextToken());  // 응시자 수
            test_room[i] = a;
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());  // 총 감독관
        int c = Integer.parseInt(st.nextToken());  // 부 감독관

        long result = 0L;
        for (int i = 1; i <= n; i++) {
            int k = test_room[i] - b;  // 감독해야할 남은 인원
            test_room[i] = k;
            result += 1;
        }
        for (int i = 1; i <= n; i++) {
            if (test_room[i] > 0) {
                int cnt_c = test_room[i] / c;
                test_room[i] -= (c * cnt_c);
                if (test_room[i] > 0 && test_room[i] % c != 0) {
                    cnt_c += 1;
                }
                result += cnt_c;
            }
        }

        System.out.println(result);
    }
}
