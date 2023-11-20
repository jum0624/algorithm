package algorithm_challenge.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] numbers = new int[n];
        int[] index = new int[r];
        boolean[] checked = new boolean[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        Param(numbers, index, checked, 0);

    }

    static void Param(int[] numbers, int[] index, boolean[] checked, int r) {
        if (r >= index.length){
            for (int i : index
            ) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if(checked[i]) continue;
            checked[i] = true;
            index[r] = numbers[i];
            Param(numbers, index, checked, r+1);
            checked[i] = false;
        }
    }
}
