package graph_traversal.boj_1325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int[] index;
    static boolean[] visited;
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static int n;
    static int m;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n + 1][n + 1];
        index = new int[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[y][x] = 1;
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            arrayList.clear();
            dfs(i);
            index[i] = arrayList.size();
        }

        int cnt = Arrays.stream(index).max().orElse(0);

        for (int i = 1; i <= n; i++) {
            if (index[i] == cnt) {
                System.out.print(i + " ");
            }
        }
    }

    static void dfs(int idx) {
        arrayList.add(idx);
        for (int i = 1; i <= n; i++) {
            if (map[idx][i] == 1 && !visited[i]) {
                visited[i] = true;
                dfs(i);
            }
        }
    }
}
