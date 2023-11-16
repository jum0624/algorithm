package ssafy.방배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] grade = new int[7][2];
    static int n;   // 참여 학생 수
    static int k;   // 최대 수용 인원수
    static int s;   // 성별
    static int y;   // 학년
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            grade[y][s] += 1;
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= 1; j++) {
                if (grade[i][j] == 0) {
                    continue;
                }
                else if (grade[i][j] <= k) {
                    result += 1;
                }
                else if (grade[i][j] % k != 0) {
                    result += (grade[i][j] / k) + 1;
                }
                else if (grade[i][j] % k == 0) {
                    result += (grade[i][j] / k);
                }
            }
        }
        System.out.println(result);
    }
}
