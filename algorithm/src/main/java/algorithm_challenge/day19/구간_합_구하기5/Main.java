package algorithm_challenge.day19.구간_합_구하기5;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] index;
    static int[][] prefix;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        index = new int[n + 1][n + 1];
        prefix = new int[n + 1][n + 1];


        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < n + 1; j++) {
                index[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < prefix.length; i++) {
            for (int j = 1; j < prefix.length ; j++) {
                prefix[i][j] = prefix[i][j - 1] - prefix[i - 1][j - 1] + prefix[i - 1][j] + index[i][j];
            }
        }


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = prefix[x2][y2] - prefix[x1-1][y2] - prefix[x2][y1-1] + prefix[x1-1][y1-1];
            System.out.println(sum);
        }

    }
}
