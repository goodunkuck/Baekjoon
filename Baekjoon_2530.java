import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2530 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int D = Integer.parseInt(br.readLine());
		
		//1���� 60���̱⿡ D�п� 60�� ������ ���� ��� �������� �� ��, �ʿ� �ջ�
		B += D / 60;
		C += D % 60;
		//C�ʸ� 60�� �Ʒ��� �������ֱ� ���� ������ ��� �������� �а� �ʿ� �ջ� �� ����
		B += C / 60;
		C = C % 60;
		//B���� 60�� �Ʒ��� �������ֱ� ���� ������ ��� �������� �а� �ʿ� �ջ� �� ����
		A += B / 60;
		B = B % 60;
		//A�ð� �ſ� ���� ���� �� �ֱ⿡ 24�� ���� �������� ����
		A = A % 24;
		
		//��� ������ �ΰ� ��� ���
		System.out.println(A + " " + B + " " + C);
	}

}
