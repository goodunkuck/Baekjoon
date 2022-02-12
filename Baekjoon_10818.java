import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10818 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int min = 1000000, max = -1000000;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			//�Է°��� �ִ񰪺��� ũ�� max�� ����
			if(num > max) max = num;
			
			//�Է°��� �ּڰ����� ������ min�� ����
			if(num < min) min = num;
		}
		System.out.println(min + " " + max);
	}

}
