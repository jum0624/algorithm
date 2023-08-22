package day10.모든순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] numbers;
    public static int[] index;
    public static boolean[] checked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        numbers = new int[n];
        index = new int[n];
        checked = new boolean[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            index[i] = 0;
            checked[i] = false;
        }
        param(0);
    }

    public static void param(int idx) {
        if (idx >= index.length) {
            for (int i : index
            ) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (checked[i]) continue;
            index[idx] = numbers[i];
            checked[i] = true;
            param(idx + 1);
            checked[i] = false;
        }
    }
}
