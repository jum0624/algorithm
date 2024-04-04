package boj_23971;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int count = 0;
		for(int i=0;i<w;i=i+m+1) {
			for(int j=0;j<h;j=j+n+1) {
//				System.out.printf("(%d, %d)", i, j);
				count += 1;
			}
		}
		
		System.out.println(count);
	}

}