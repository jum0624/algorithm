package day18.치킨배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n;
    static int m;
    static int[][] array;
    static Point[] index;  // 선택된 치킨집
    static ArrayList<Point> chickens;
    static ArrayList<Point> houses;
    static int distance_min = 9999;
    static int result = 9999;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        array = new int[n][n];
        index = new Point[m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        chickens = new ArrayList<>();
        houses = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 2) chickens.add(new Point(i, j));
                else if (array[i][j] == 1) houses.add(new Point(i, j));
            }
        }
        solution(0, 0);
        System.out.println(result);
    }

    static void solution(int idx, int count) {
        if (idx >= index.length) {
            int distance_sum = 0;
            for (int i = 0; i < houses.size(); i++) {
                distance_min = 9999;
                for (int j = 0; j < index.length; j++) {
                    int dx = Math.abs(houses.get(i).x - index[j].x);
                    int dy = Math.abs(houses.get(i).y - index[j].y);
                    int distance = dx + dy;
                    // 한 집에서 가장 가까운 치킨집 거리 찾기
                    if (distance_min >= distance) {
                        distance_min = distance;
                    }
                }
                // 집마다 가장 가까운 치킨집 거리 더하기
                distance_sum += distance_min;
            }
            if(result >= distance_sum) result = distance_sum;
            return;
        }
        for (int i = count; i < chickens.size() ; i++) {
            index[idx] = chickens.get(i);
            solution(idx + 1, i + 1);
        }
    }
}
