import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2765 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�ش� ���̽� ��
		int i = 1;
		//�׽�Ʈ ���̽� ���� ���������� �ʱ� ������ ���ѷ��� ���
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//����, ȸ����, �� ������ ���� ����
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			double C = Double.parseDouble(st.nextToken());
			//ȸ������ 0�� ���� �ݺ��� �����Ѵ�.
			if(B == 0) {
				break;
			}
			//�����Ҷ� ����� �ʸ� �ð����� �ٲ��ش�. 3600�� ������ �ǰ�, 60���� �ι� ������ �ȴ�.
			C = (C / 60) / 60;
			//�̵� �Ÿ��� �и��Ÿ��� �ٲٴ� ����
			double distance = ((((A * 3.1415927) * B) / 12) / 5280);
			//MPH�� ���ϴ� ����
			double MPH = (distance / C); 
			
			//print�� ���ٸ��� ������ �ǰ� ����ó�� ������Ű��� �������� ������ ��¹��� �ۼ��ص� �ȴ�.
			System.out.print("Trip #" + i + ": ");
			System.out.print(String.format("%.2f", distance) + " ");
			System.out.print(String.format("%.2f", MPH));
			//����� ������ ���� ���̽� �Է½ÿ� �ٹٲ��� �ش�.
			System.out.println();
			
			//�ݺ��� �Ѿ������ ���̽� ���� 1�� ���Ѵ�.
			i++;
		}
	}

}
