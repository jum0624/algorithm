package day22.참외밭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] index = new int[6];
    static int max_x = 0;
    static int max_y = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int index_x = 0;
        int index_y = 0;
        for (int k = 0; k < 6; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int direct = Integer.parseInt(st.nextToken());
            int move = Integer.parseInt(st.nextToken());
            index[k] = move;
            if (direct == 1 || direct == 2) {
                if ((max_x < move)) {
                    max_x = move;
                    index_x = k;
                }
                
            }
            if (direct == 3 || direct == 4) {
                if ((max_y < move)) {
                    max_y = move;
                    index_y = k;
                }
            }
        }


        if (index_x - 1 >= 0 && index_x - 1 != index_y) {
            index[index_x - 1] = 0;
        }
        if ((index_x + 1) % 6 != index_y) {
            index[(index_x + 1) % 6] = 0;
        }
        if ((index_x == 0 && index_y != 5) || (index_y == 0 && index_x != 5)) {
            index[5] = 0;
        }
        if (index_y - 1 >= 0 && index_y - 1 != index_x) {
            index[index_y - 1] = 0;
        }
        if ((index_y + 1) % 6 != index_x) {
            index[((index_y + 1) % 6)] = 0;
        }

        index[index_x] = 0;
        index[index_y] = 0;

        int result = 1;

        for (int i = 0; i < index.length; i++) {
            if (index[i] != 0) {
                result *= index[i];
            }
        }

        int k = max_x * max_y - result;
        System.out.println(k * n);


    }
}
