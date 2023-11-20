package algorithm_challenge.ssafy.줄세우기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[] numbers;
    static ArrayList<Integer> line = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        numbers = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < T; i++) {
            line.add(i - numbers[i], i+1);
        }

        for (Integer num : line
        ) {
            System.out.print(num + " ");
        }
    }
}
