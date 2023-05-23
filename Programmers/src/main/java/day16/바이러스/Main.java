package day16.바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static boolean[] visit;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int node = Integer.parseInt(br.readLine());
        int link = Integer.parseInt(br.readLine());

        graph = new int[node+1][node+1];
        visit = new boolean[node + 1];

        for (int i = 0; i < link; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            graph[k][l] = 1;
            graph[l][k] = 1;
        }

        dfs(1);

        System.out.println(count-1);


    }

    public static void dfs(int start_node) {
        visit[start_node] = true;
        count++;
        for (int i = 1; i < visit.length; i++) {
            if (graph[start_node][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
}
