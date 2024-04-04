package boj_2292;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int k = 1;
		int sum = 0;
		
		while(true) {
			sum += k;
			if(sum >= n) {
				break;
			}
			k = 6 * count;
			count ++;
		}
		
		System.out.println(count);

	}

}
