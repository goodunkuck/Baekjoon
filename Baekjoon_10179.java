import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10179 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//ù �ٿ� ����Ʈ ���̽��� ���� �Է�
		int N = Integer.parseInt(br.readLine());
		
		//for���� i�� 0���� N���� �����ϹǷν� N�� �ݺ��ϰ� ����
		for(int i = 0; i < N; i++) {
			//�ݺ� Ƚ�� ��ŭ �ݾ��� �Է�. �Է°��� �Ǽ��̴� double������ ����ȯ
			double money = Double.parseDouble(br.readLine());
			//20���� ������ ���ϱ� 0.8�� ����
			money *= 0.8;
			
			System.out.println("$" + String.format("%.2f", money));
		}
	}
}
