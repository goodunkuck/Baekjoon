import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5543 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�ּҰ��� �����ϱ� ���� ���� ����. ���� �ִ�� ������ �� �ִ� ������ 2000��
		int Amin = 2000;
		int Bmin = 2000;
		
		//�ܹ��� ���� �Էµ� ������ �ּҰ��� ����
		for(int i = 0; i < 3; i++) {
			int N = Integer.parseInt(br.readLine());
			if(N < Amin) {
				Amin = N;
			}
		}
		//���� ���� �Էµ� ������ �ּҰ��� ����
		for(int i = 0; i < 2; i++) {
			int N = Integer.parseInt(br.readLine());
			if(N < Bmin) {
				Bmin = N;
			}
		}
		//�� ������ �ּҰ��� ���ϰ� ��Ʈ ���� ���� ����
		System.out.println(Amin + Bmin - 50);
	}

}
