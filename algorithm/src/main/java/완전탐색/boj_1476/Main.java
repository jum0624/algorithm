package 완전탐색.boj_1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int year = 1;

        int earth = 1;
        int sun = 1;
        int moon = 1;
        while(earth != e || sun != s || moon != m) {
            earth += 1;
            sun += 1;
            moon += 1;
            year += 1;
            if(earth > 15) {
                earth = 1;
            }
            if(sun > 28) {
                sun = 1;
            }
            if(moon > 19) {
                moon = 1;
            }
        }

        System.out.println(year);
    }
}
