package 분할정복.boj_2630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int n;
    static int[] result = new int[2];
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

        func(0, 0, n);

        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    static void func(int x, int y, int k) {
        int start_num = map[x][y];
        if (k == 0) {
//            result[start_num] += 1;
            return;
        }
        boolean isTrue = true;
        for (int i = x; i < x + k; i++) {
            for (int j = y; j < y + k; j++) {
                if (map[i][j] != start_num) {
                    isTrue = false;
                    k = k / 2;
                    func(x, y, k);
                    func(x, y + k, k);
                    func(x + k, y, k);
                    func(x + k, y + k, k);
                }
                if(!isTrue) break;
            }
            if (!isTrue) break;
        }
        if(isTrue) result[start_num] += 1;
    }
}
