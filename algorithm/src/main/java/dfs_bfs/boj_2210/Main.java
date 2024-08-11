package dfs_bfs.boj_2210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static String[][] map;
    static String[] index;

    static HashSet<String> set;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new String[5][5];
        set = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = st.nextToken();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                index = new String[6];
                dfs(0, i, j);
            }
        }

        System.out.println(set.size());

    }

    static void dfs(int idx, int x, int y) {
        if (idx >= 6) {
            set.add(listToString(index));
            return;
        }

        for (int i = 0; i < 4; i++) {
            int next_x = x + dx[i];
            int next_y = y + dy[i];
            index[idx] = map[x][y];
            if (next_x >= 0 && next_x < 5 && next_y >= 0 && next_y < 5) {
                dfs(idx + 1, next_x, next_y);
            }
        }
    }

    static String listToString(String[] index) {
        String result = "";
        for (int i = 0; i < index.length; i++) {
            result += index[i];
        }
        return result;
    }
}
