import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baekjoon_1181 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<String>();
		
		//�Է°��� list�� ����
		for(int i = 0; i < N; i++) {
			list.add(br.readLine());
		}
		//����
		Collections.sort(list);
		
		//�Է� ���� ���� ������ 50�̱� ������ 1~50���� Ȯ��
		for(int i = 1; i <= 50; i++) {
			for(int j = 0; j < list.size();) {
				//�ش� �ε����� ���� ���̰� i�� ���ٸ� sb�� �����ϰ� list���� �ش��ϴ� ��� ���� ����
				if(list.get(j).length() == i) {
					sb.append(list.get(j)).append("\n");
					list.removeAll(Arrays.asList(list.get(j)));
				//�����ϸ� �翬 ���� �ε����� �ִ� ���� ������µ� ���� �ε����� �Ѿ��
				//�翬�ϰԵ� ���� �ε����� �Ű��� ���� �Ѿ�����⶧���� �������� �ʾ������� ���� �ε����� �Ѿ��.
				}else {
					j++;
				}
			}
			//list�� �������� �ݺ����� �����Ѵ�,
			if(list.isEmpty()) break;
		}
		System.out.println(sb);
	}

}
