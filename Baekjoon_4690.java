
public class Baekjoon_4690 {

	public static void main(String[] args) {
		//��� ���ڿ��� �Է¹ް� �������� �ѹ��� ����ϱ� ���� StringBuilder�� ����
		StringBuilder sb = new StringBuilder();
		
		//Ǯ�� ������� ������ 4���� �ݺ���
		for(int a = 2; a <= 100; a++) {
			for(int b = 2; b <= a; b++) {
				for(int c = b; c <= a; c++) {
					for(int d = c; d <= a; d++) {
						//������������ ��쿡 ��¹��� ���
						if(a*a*a == b*b*b + c*c*c + d*d*d) {
							System.out.println("Cube = " + a + ", Triple = (" + b + "," + c + "," + d +")");
						}
					}
				}
			}
		}
	}

}
