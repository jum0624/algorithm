package day11.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] numbers;
    static int[] index;
    static boolean[] checked;  // 중복 방지를 위해 checked로 확인

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        numbers = new int[n];
        index = new int[r];
        checked = new boolean[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        comb(0, 0);
    }

    static void comb(int idx, int count) {
        if (idx >= index.length) {
            for (int i : index
            ) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = count; i < numbers.length; i++) {
//            if (checked[i]) continue;
            index[idx] = numbers[i];
            comb(idx+1, i + 1);
        }
    }
}
