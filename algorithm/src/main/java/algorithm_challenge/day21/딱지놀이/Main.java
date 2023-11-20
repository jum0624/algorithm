package algorithm_challenge.day21.딱지놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] card_a;
    static int[] count_a;
    static int[] card_b;
    static int[] count_b ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int k = 0; k < n; k++) {
            st = new StringTokenizer(br.readLine());
            int a_size = Integer.parseInt(st.nextToken());
            card_a = new int[a_size];
            for (int i = 0; i < a_size; i++) {
                card_a[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            int b_size = Integer.parseInt(st.nextToken());
            card_b = new int[b_size];
            for (int i = 0; i < b_size; i++) {
                card_b[i] = Integer.parseInt(st.nextToken());
            }

            count_a = new int[5];
            for (int i = 0; i < a_size; i++) {
                count_a[card_a[i]]  += 1;
            }

            count_b = new int[5];
            for (int i = 0; i < b_size; i++) {
                count_b[card_b[i]] += 1;
            }

            String result = "";

            for (int i = 4; i >= 1; i--) {
                if (count_a[i] != count_b[i]) {
                    if (count_a[i] > count_b[i]) {
                        result = "A";
                    }
                    if (count_a[i] < count_b[i]) {
                        result = "B";
                    }
                    break;
                }
                if (count_a[i] == count_b[i]) {
                    result = "D";
                }
            }
            System.out.println(result);
        }
    }
}
