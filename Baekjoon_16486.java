import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_16486 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double d1 = Double.parseDouble(br.readLine());
		double d2 = Double.parseDouble(br.readLine());
		
		//파이는 Math.PI 소수점 버림 함수는 Math.floor
		double result = (2 * d1) + (2 * d2 * Math.floor(Math.PI*1000000)/1000000.0);
		
		System.out.println(result);
	}

}
