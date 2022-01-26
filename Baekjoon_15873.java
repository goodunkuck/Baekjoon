import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_15873 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int N = 0;
		
		//입력값의 길이에 따라 값을 다르게 구한다.
		//길이가 2일 결우 0인덱스 값과 1인덱스 값을 더해준다.
		//-'0' 하는 이유는 아스키 코드에 의해 변환 되는 값 때문이다.
		if(S.length() == 2) {
			N = (S.charAt(0) - '0') + (S.charAt(1) - '0');
			//길이가 3일 경우 가운데가 0이면 앞 숫자가 10 가운데가 0이 아니면 뒤 숫자가 10
			//10이 아닌 숫자를 뽑아내고 10을 더해준다.
		}else if(S.length() == 3) {
			if(S.charAt(1) == '0') {
				N = (S.charAt(2) - '0') + 10;
			}else {
				N = (S.charAt(0) - '0') + 10;
			}
			//길이가 4면 앞 뒤 다 10이 오기때문에 20 출력
		}else if(S.length() == 4){
			N = 20;
		}
		
		System.out.println(N);

	}

}
