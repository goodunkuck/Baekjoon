import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10101 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		//�� ���� ���� 180�� �ƴϸ� Error�� ���
		if((A + B + C) != 180) {
			System.out.println("Error");
			//��� ���� ������ �� ���� ũ��� 60
		}else if(A == B && B == C) {
			System.out.println("Equilateral");
			//�� ���� ������ ����
		}else if(A == B || B == C || A == C) {
			System.out.println("Isosceles");
		}else {
			System.out.println("Scalene");
		}
	}

}
