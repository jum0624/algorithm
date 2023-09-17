package day22.스위치_켜고_끄기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[] status;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        status = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (k == 1) {
                status[i] = true;
            }
        }

        int student = Integer.parseInt(br.readLine());

        for (int i = 0; i < student; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            if (gender == 1) {
                for (int j = 1; j <= n; j++) {
                    if (j % number == 0) {
                        status[j] = !status[j];
                    }
                }
            } else if (gender == 2) {
                status[number] = !status[number];
                int left = number - 1;
                int right = number + 1;
                while(left > 0 && right <= n) {
                    if (status[left] == status[right]) {
                        status[left] = !status[left];
                        status[right] = !status[right];
                    }
                    else {
                        break;
                    }
                    left = left - 1;
                    right = right + 1;
                }
            }
        }
        numbers = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (status[i]) {
                numbers[i] = 1;
            }
            if (!status[i]) {
                numbers[i] = 0;
            }
        }

        for (int i = 1; i <= n ; i++) {
            System.out.print(numbers[i] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
