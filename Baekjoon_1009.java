import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1009 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		//T����ŭ for���� �ݺ�
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			//a�� %10 ���� ���ϰ�, 0�ϰ�� 10 ����
			if(a % 10 == 0) {
				a = 10;
			}else if(a > 10){
				a = a % 10;
			}
			
			//�ݺ� Ƚ���� ���� if��
			if(a == 1 || a == 5 || a == 6 || a == 10) {
				System.out.println(a);
			}else if(a == 4 || a == 9) {
				if(b % 2 == 0) {
					System.out.println((int) ((a * a) % 10));
				}else {
					System.out.println(a);
				}
			}else {
				b %= 4;
				if(b == 0) {
					b = 4;
				}
				//2�����̸� a*a�� ��������� Ƚ���� ���ϴ� ���̸� pow�� for�� ���
				System.out.println((int) (Math.pow(a, b) % 10));
			}
		}
	}

}
