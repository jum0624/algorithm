package 백만장자_프로젝트;

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
            int item_count = 0;
            int price = 0;

            for(int d = 0; d < day_price.length-1; d++) {
                if(day_price[d] <= day_price[d+1]) {
                    price -= day_price[d];
                    item_count += 1;
                }
                if(day_price[d] > day_price[d+1]) {
                    price += (item_count * day_price[d]);
                    item_count = 0;
                }
                if (d + 1 == day_price.length - 1 && day_price[d] <= day_price[d+1] ) {
                    price += (item_count * day_price[d + 1]);
                }
            }
            System.out.println("#" + (i+1) + " " + price);
        }



    }

}
