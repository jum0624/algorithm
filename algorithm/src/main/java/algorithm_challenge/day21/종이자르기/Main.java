package algorithm_challenge.day21.종이자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[] row_visited;
    static boolean[] column_visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        row_visited = new boolean[row];
        column_visited = new boolean[column];

        int n = Integer.parseInt(br.readLine());

        for (int k = 0; k < n; k++) {
            st = new StringTokenizer(br.readLine());
            int choice = Integer.parseInt(st.nextToken());
            int line = Integer.parseInt(st.nextToken());
            if (choice == 1) {
                row_visited[line] = true;
            }
            if (choice == 0) {
                column_visited[line] = true;
            }
        }

        int max_row = 0;
        int tmp = 0;
        for (int i = 0; i < row; i++) {
            if (row_visited[i]) {
                max_row = Math.max(max_row, tmp);
                tmp = 1;
            } else {
                tmp++;
            }
        }
        max_row = Math.max(max_row, tmp);

        int max_column = 0;
        tmp = 0;
        for (int i = 0; i < column; i++) {
            if (column_visited[i]) {
                max_column = Math.max(max_column, tmp);
                tmp = 1;
            } else {
                tmp++;
            }
        }
        max_column = Math.max(max_column, tmp);

        System.out.println(max_row * max_column);
    }
}
