import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_4766 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N = Double.parseDouble(br.readLine());
		
		//���ѷ���
		while(true) {
			double N2 = Double.parseDouble(br.readLine());
			//���ѷ��� ����
			if(N2 == 999) {
				break;
			}
			//�Ҽ��� 2��°�ڸ����� ������ ǥ��
			System.out.println(String.format("%.2f", (N2 - N)));
			//���簪�� ���� ���� ������ϱ� ������ N�� �����ؼ� ����ؼ� �������� �������ش�.
			N = N2;
		}
	}

}
