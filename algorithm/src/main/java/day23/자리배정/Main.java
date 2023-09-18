package day23.자리배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(br.readLine());

        map = new int[x + 1][y + 1];
        int count = 1;
        int point_x = 1;
        int point_y = 1;
        int next_x = 1;
        int next_y = 1;
        int k = 0;
        while (count != x * y + 1) {
            if (next_x <= 0 || next_x > x || next_y <= 0 || next_y > y || map[next_x][next_y] != 0) {
                k += 1;
                next_x = point_x + dx[k % 4];
                next_y = point_y + dy[k % 4];
            }
            point_x = next_x;
            point_y = next_y;
            map[point_x][point_y] = count;
            next_x = point_x + dx[k % 4];
            next_y = point_y + dy[k % 4];
            count += 1;
        }

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (number == map[i][j]) {
                    System.out.print(i + " " + j);
                }
            }
        }
        if (x * y < number) {
            System.out.println(0);
        }
    }
}
