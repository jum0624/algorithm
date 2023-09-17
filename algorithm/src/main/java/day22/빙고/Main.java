package day22.빙고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map = new int[5][5];
    static boolean[] visited_x = new boolean[5];
    static boolean[] visited_y = new boolean[5];
    static boolean[] visited = new boolean[2];
    static int[] list = new int[25];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int k = 0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                list[k] = Integer.parseInt(st.nextToken());
                k += 1;
            }
        }

        // 빙고 시작
        // 방문한 숫자는 0으로 change
        // 조건 1. 한 줄 or 한 대각선이 모두 0인지
        // 조건 2. visited에서 해당 위치가 모두 true라면 bingo x
        int bingo = 0;
        int point_x = 0;
        int point_y = 0;
        int t = 0;
        while(bingo < 3 && t < 25) {
            int point = list[t];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (map[i][j] == point) {
                        point_x = i;
                        point_y = j;
                        break;
                    }
                }
                if (map[point_x][point_y] == point) {
                    map[point_x][point_y] = 0;
                    break;
                }
            }

            // 세로 확인
            boolean check = true;
            for (int i = 0; i < 5; i++) {
                if (map[i][point_y] != 0) {
                    check = false;
                    break;
                }
            }

            if (check && !visited_y[point_y]) {
                visited_y[point_y] = true;
                bingo += 1;
            }



            // 가로 확인
            check = true;
            for (int i = 0; i < 5; i++) {
                if (map[point_x][i] != 0) {
                    check = false;
                    break;
                }
            }

            if (check && !visited_x[point_x]) {
                visited_x[point_x] = true;
                bingo += 1;
            }

            // 대각선 확인
            check = true;
            for (int i = 0; i < 5; i++) {
                if (map[i][i] != 0) {
                    check = false;
                    break;
                }
            }

            if (check && !visited[0]) {
                visited[0] = true;
                bingo += 1;
            }

            check = true;
            int j = 4;
            for (int i = 0; i < 5; i++) {
                if (map[j][i] != 0) {
                    check = false;
                    break;
                }
                j--;
            }
            if (check && !visited[1]) {
                visited[1] = true;
                bingo += 1;
            }
            t++;
        }
        System.out.println(t);
    }
}
