package 분할정복.boj_18222;

import java.util.Scanner;

public class Main {
	
	static long index[] = new long[64];
	static long n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		
		index[0] = 1;
		for(int i=1;i<64;i++) {
			index[i] = index[i-1] * 2;
		}
		
		System.out.println(func(n));
		
		
	}
	
	static int func(long k) {
		if(k == 1) {
			return 0;
		}
		for(int i=0;i<64;i++) {
			if(k <= index[i]) {
				return 1 - func(k - index[i-1]);
			}
		}
		return 0;
		
	}

}

