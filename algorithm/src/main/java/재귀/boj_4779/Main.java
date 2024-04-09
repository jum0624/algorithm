package 재귀.boj_4779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] str;
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st;
        while((st = br.readLine()) != null && !st.isEmpty()) {
            int n = Integer.parseInt(st);
            int k = (int)Math.pow(3,n);
            str = new String[k];

            func(k, 0);
            for (int i = 0; i < str.length; i++) {
                if(str[i] == null) str[i] = " ";
                sb.append(str[i]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void func(int k, int start) {
        if(k == 1) {
            str[start] = "-";
            return;
        }
        int n = k / 3;
        func(n, start);
        func(n, start + (2*n));
    }
}
