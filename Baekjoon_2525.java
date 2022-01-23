import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2525 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		//�ι�° �ٿ� ����ؾ��ϴ� ���� �ϳ��� StringTokenizer�� �ƴ� �⺻ �Է��� ���
		int C = Integer.parseInt(br.readLine());
		
		//1�ð��� 60���̱⿡ C�п� 60�� ������ ���� ��� �������� �� ��, �о� �ջ�
		A += C / 60;
		B += C % 60;
		
		//���� 60���̻��̸� A�ÿ� 1�ð� �߰� �� B�п��� 60�� ����
		if(B > 59) {
			A += 1;
			B -= 60;
		}
		//�Ϸ�� 24�ð��̱⿡ A�ð� 24 �̻��̸� A���� 24 ����
		if(A > 23) {
			A -= 24;
		}
		//��� ������ �ΰ� ��� ���
		System.out.println(A + " " + B);
	}

}
