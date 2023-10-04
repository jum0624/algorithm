package day26.백만장자_프로젝트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int[] day_price;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int day = Integer.parseInt(br.readLine());
            day_price = new int[day];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < day; j++) {
                day_price[j] = Integer.parseInt(st.nextToken());
            }

            long price = 0;
            int k = 0;
            while (k < day) {
                int max_index = k;
                int item_count = 0;
                for (int j = k; j < day; j++) {
                    if (day_price[j] > day_price[max_index]) {
                        max_index = j;
                    }
                }
                for (int j = k; j < max_index; j++) {
                    price -= day_price[j];
                    item_count += 1;
                }
                k = max_index + 1;
                price += (long) day_price[max_index] * item_count;
            }
            System.out.println("#" + (i+1) + " " + price);
        }



    }

}
