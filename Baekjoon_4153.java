import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4153 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if(A == 0 && B == 0 && C == 0) {
				break;
			}
			
			//�� ���� �����ؼ� ����
			double Apow = Math.pow(A, 2);
			double Bpow = Math.pow(B, 2);
			double Cpow = Math.pow(C, 2);
			
			//��Ÿ��� ����
			if(Apow + Bpow == Cpow) {
				System.out.println("right");
			}else if(Apow + Cpow == Bpow){
				System.out.println("right");
			}else if(Bpow + Cpow == Apow) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}	
	}

}
