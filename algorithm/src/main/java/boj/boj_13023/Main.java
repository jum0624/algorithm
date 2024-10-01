package boj.boj_13023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static List<List<Integer>> map;
    static boolean isTrue;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new ArrayList<>();
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            map.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map.get(x).add(y);
            map.get(y).add(x);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(map.get(i));
        }

        isTrue = false;
        for (int i = 0; i < n; i++) {
            if (!isTrue) {
                visited[i] = true;
                dfs(i, 0);
                visited[i] = false;
            }
        }

        int result = 0;
        if (isTrue) {
            result = 1;
        }

        System.out.println(result);
    }

    static void dfs(int idx, int dept) {
        if (dept == 4) {
            isTrue = true;
            return;
        }
        for (int i = 0; i < map.get(idx).size(); i++) {
            Integer target = map.get(idx).get(i);
            if (!visited[target] && !isTrue) {
                visited[target] = true;
                dfs(target, dept + 1);
                visited[target] = false;
            }
        }
    }
}
