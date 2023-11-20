package algorithm_challenge.ssafy.일곱난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] people = new int[9];
    static int[] member = new int[7];
    static boolean[] choice = new boolean[9];
    static int[] result = new int[7];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            people[i] = Integer.parseInt(br.readLine());
        }
        comb(0);
        for (int num : result
        ) {
            System.out.println(num);
        }
    }

    static void comb(int idx) {
        if (idx == member.length) {
            int sum = 0;
            for (int num : member
            ) {
                sum += num;
            }
            if (sum == 100) {
                Arrays.sort(member);
                for (int i = 0; i < 7; i++) {
                    result[i] = member[i];
                }
                return;
            }
            return;
        }
        for (int i = idx; i < people.length; i++) {
            if (!choice[i]) {
                choice[i] = true;
                member[idx] = people[i];
                comb(idx + 1);
                choice[i] = false;
            }
        }
    }
}
