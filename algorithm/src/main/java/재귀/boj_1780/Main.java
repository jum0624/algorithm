package 재귀.boj_1780;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int[] count = new int[3];  // 0: -1, 1 : 0, 2: 1 (number + 1번째 인덱스에 number 저장)
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        div(0, 0, n);

        for (int cnt : count
        ) {
            System.out.println(cnt);
        }
    }

    static void div(int x, int y, int k) {
        int key = map[x][y];
        for (int i = x; i < x + k; i++) {
            for (int j = y; j < y + k; j++) {
                if (key != map[i][j]) {
                    div(x, y, k / 3);
                    div(x, y + k / 3, k / 3);
                    div(x, y + (2 * (k / 3)), k / 3);
                    div(x + (k / 3), y, k / 3);
                    div(x + (k / 3), y + k / 3, k / 3);
                    div(x + (k / 3), y + (2 * (k / 3)), k / 3);
                    div(x + (2 * (k / 3)), y, k / 3);
                    div(x + (2 * (k / 3)), y + k / 3, k / 3);
                    div(x + (2 * (k / 3)), y + (2 * (k / 3)), k / 3);
                    return;
                }
            }
        }
        count[key + 1] += 1;
    }
}
