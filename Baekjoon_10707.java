import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10707 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		//X�� Y���� �� �⸨���� ������ ������ ����
		int X = A * P;
		//Y��� ���� �⸧���� ���� ������ �ٸ��⿡ 0���� �ʱ�ȭ
		int Y = 0;
		
		//���� �⸧ ���� ���� Y�� �⸧�� ����
		if(C >= P) {
			Y = B;
		}else {
			Y = B + ((P - C) * D);
		}
		//�� ���� ���� ȸ�� �⸧�� ���
		if(X < Y) {
			System.out.println(X);
		}else {
			System.out.println(Y);
		}
	}

}
