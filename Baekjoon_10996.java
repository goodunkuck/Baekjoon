import java.io.*;
import java.util.*;
import java.lang.*;

public class Baekjoon_10996 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N == 1) {
			System.out.println("*");
		}else {
			for(int i = 0; i < N * 2; i++) {
				if(i % 2 == 0) {
					for(int j = 0; j < N; j++) {
						if(j % 2 == 0) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}					
				}else {
					for(int j = 0; j < N; j++) {
						if(j % 2 == 1) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}