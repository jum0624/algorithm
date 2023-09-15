package day20.줄_세우기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int[] random;
    static int[] line;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        random = new int[n];
        line = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            random[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(0, 1);
        for (int i = 1; i < n; i++) {
            int cnt = random[i];
            if (cnt != 0) {
                arrayList.add(i - cnt, i+1);
            }
            if (cnt == 0) {
                arrayList.add(i, i+1);
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
