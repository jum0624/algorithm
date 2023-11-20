package algorithm_challenge.day27.피로도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());;
        int b = Integer.parseInt(st.nextToken());;
        int c = Integer.parseInt(st.nextToken());;
        int m = Integer.parseInt(st.nextToken());;
        int energy = 0;
        int work_amount = 0;
        int hour = 0;
        while (hour != 24) {
            if (m < a) {
                work_amount = 0;
                break;
            }
            if (m >= energy + a) {
                energy += a;
                work_amount += b;
            }
            else {
                energy -= c;
                if (energy < 0) {
                    energy = 0;
                }
            }
            hour += 1;

        }
        System.out.println(work_amount);
    }
}
