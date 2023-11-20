package algorithm_challenge.day11.일곱난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int[] numbers = new int[9];  // 모든 난쟁이들
    static int[] index = new int[7];   // 7명의 난쟁이
    static int sum = 0;
    static int[] result = new int[7];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        comb(0, 0);
        for (int i : result
        ) {
            System.out.println(i);
        }
    }

    static void comb(int idx, int cnt) {
        if (idx == index.length) {
            sum = 0;
            for (int i : index
            ) {
                sum += i;
            }
            if (sum == 100) {
                Arrays.sort(index);
                System.arraycopy(index, 0, result, 0, result.length);
            }
            return;
        }
        for (int i = cnt; i < numbers.length; i++) {
            index[idx] = numbers[i];
            comb(idx + 1, i + 1);
        }
    }
}
