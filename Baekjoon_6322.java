import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_6322 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		
		//���ѷ���
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//�Ҽ��� �ڸ��� ǥ���� ���� �Ǽ������� ����
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			
			//0 0 0 �Է� �� ���ѷ��� ����
			if(a == 0 && b == 0 && c == 0) break;
			
			//���ǿ� ���� ������ �ʴ� ��¹�
			System.out.println("Triangle #" + i);
			
			if(a == -1) {
				if(c <= b) {
					System.out.println("Impossible.");
				}else {
					a = Math.sqrt((c * c) - (b * b));
					System.out.println("a = " + String.format("%.3f", a));
				}
			}
			if(b == -1) {
				if(c <= a) {
					System.out.println("Impossible.");
				}else {
					b = Math.sqrt((c * c) - (a * a));
					System.out.println("b = " + String.format("%.3f", b));
				}
			}
			if(c == -1) {
				c = Math.sqrt((a * a) + (b * b));
				System.out.println("c = " + String.format("%.3f", c));
			}
			//���� ���̽��� ��ȣ�� �־��ֱ� ���� i�� +1���ش�.
			i++;
			System.out.println();
		}
	}

}
