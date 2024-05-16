package 재귀.boj_6603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] index;
    static int[] choice;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String input = br.readLine();
        while (!input.equals("0")) {
            st = new StringTokenizer(input);
            n = Integer.parseInt(st.nextToken());

            index = new int[n];
            choice = new int[6];

            for (int i = 0; i < n; i++) {
                index[i] = Integer.parseInt(st.nextToken());
            }

            comb(0, 0);

            sb.append("\n");

            input = br.readLine();
        }

        System.out.println(sb);

    }


    // idx = 현재 choice에 둘 위치
    // k = 선택한 수의 인덱스
    static void comb(int idx, int k) {
        if (k == choice.length) {  // 6개를 모두 고르면 종료
            print(choice);
            return;
        }
        for (int i = idx; i < n; i++) {
            choice[k] = index[i];
            comb(i + 1, k + 1);
        }
    }

    static void print(int[] choice) {
        for (int i = 0; i < choice.length; i++) {
            sb.append(choice[i] + " ");
        }
        sb.append("\n");
    }
}
