package algorithm_challenge.day24.피보나치수4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static BigInteger[] prefix;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(sc.nextLine());

        prefix = new BigInteger[n + 1];
        prefix[0] = BigInteger.ZERO;
        prefix[1] = BigInteger.ONE;
        for (int i = 2; i <= n ; i++) {
            prefix[i] = prefix[i-2].add(prefix[i - 1]) ;
        }

        bw.write(String.valueOf(prefix[n]));
        bw.flush();
        bw.close();

    }
}
