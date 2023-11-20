package algorithm_challenge.day27.최빈값_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            count = new int[101];
            int t = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int k = 0; k < 1000; k++) {
                int score = Integer.parseInt(st.nextToken());
                count[score] += 1;
            }
            int max_num = 0;
            int max_index = 0;
            for (int i = 0; i < count.length; i++) {
                if (max_num <= count[i]) {
                    max_num = count[i];
                    max_index = i;
                }
            }
            System.out.println("#" + test_case + " " + max_index);
        }
    }
}
