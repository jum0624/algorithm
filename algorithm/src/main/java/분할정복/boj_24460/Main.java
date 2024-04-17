package 분할정복.boj_24460;

import java.util.*;
import java.io.*;

public class Main {
	
	static int[][] map;
	static int[] dx = {0,0,1,1};
	static int[] dy = {0,1,0,1};
	
	static int k;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		
		map = new int[k][k];
		
		for(int i=0;i<k;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<k;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int result = func(0,0,k/2);
		System.out.print(result);
		
	}
	
	static int func(int x, int y, int k) {
		if(k == 0) {
			return map[x][y];
		}
		int[] list = new int[4];
		list[0] = func(x, y, k/2);
		list[1] = func(x + k, y, k/2);
		list[2] = func(x, y+k, k/2);
		list[3] = func(x+k, y+k, k/2);
		Arrays.sort(list);
		return list[1];
	}

}
