package algorithm_challenge.day20.방_배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] students = new int[6][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            students[grade - 1][gender] += 1;
        }

        int result = 0;
        for (int i = 0; i < 6; i++) {
            if (students[i][0] > 0 && students[i][0] <= k) {
                result += 1;
            }

            if (students[i][0] > k) {
                result += students[i][0] / k + 1;
            }

            if (students[i][1] > 0 && students[i][1] <= k) {
                result += 1;
            }

            if (students[i][1] > k) {
                result += students[i][1] / k + 1;
            }
        }

        System.out.println(result);


    }
}
