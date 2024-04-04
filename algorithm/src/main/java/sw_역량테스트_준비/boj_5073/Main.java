package boj_5073;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		int a;
		int b;
		int c;
		int max_num = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			max_num = Math.max(a, b);
			c = Integer.parseInt(st.nextToken());
			max_num = Math.max(max_num, c);
			
			if(a == 0 && b == 0 && c ==0) break;
			int sum = a + b + c - max_num;
			
			HashSet<Integer> hash = new HashSet<>();
			hash.add(a);
			hash.add(b);
			hash.add(c);
			if(sum <= max_num) System.out.println("Invalid");
			else if(hash.size() == 1) System.out.println("Equilateral");
			else if(hash.size() == 2) System.out.println("Isosceles");
			else if(hash.size() == 3) System.out.println("Scalene");
			
		}
	}

}
