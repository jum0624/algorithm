package algorithm_challenge.ssafy.장애물_경주_난이도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] numbers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            int down = 0;
            int up = 0;
            int n = Integer.parseInt(br.readLine());
            numbers = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 1; i < n; i++) {
                int distance = numbers[i - 1] - numbers[i];
                if (distance > 0 && up < distance) {
                    up = distance;
                }
                if (distance < 0 && down > distance) {
                    down = distance;
                }
            }
            System.out.printf("#%d %d %d\n", test_case, Math.abs(down), up);
        }
    }
}
