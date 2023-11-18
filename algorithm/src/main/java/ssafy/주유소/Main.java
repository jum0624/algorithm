package ssafy.주유소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] distance;
    static long[] cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        distance = new long[n];
        cost = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < distance.length-1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cost.length; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        int min_index = 0;
        long sum = 0;
        for (int i = 0; i < n-1; i++) {
            if(cost[min_index] >= cost[i]) {
                min_index = i;
            }
            sum += cost[min_index] * distance[i];
        }
        System.out.println(sum);
    }
}
