package stack.boj_1120;

import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String x = st.nextToken();
		String y = st.nextToken();
		
		String[] split_x = x.split("");
		String[] split_y = y.split("");
		
		int min_sum = 999;
		for(int i=0;i<=y.length() - x.length();i++) {
			int sum = 0;
			for(int j=0;j<x.length();j++) {
				if(!split_x[j].equals(split_y[i + j])) {
					sum += 1;
				}
			}
			
			min_sum = Math.min(min_sum, sum);
		}
		
		System.out.println(min_sum);
		
	}

}
