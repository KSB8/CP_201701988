import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		
		int sum, count;
		int N;
		sum = 0;
		count = 1;
		System.out.println("1부터 N까지 합계를 구하려고 합니다. N값을 입력하십시오.");
		N = aScanner.nextInt();
		while (count <= N){
			sum = sum + count;
			System.out.println("1부터 " + count +"까지의 합은 " + sum + "입니다." );
			count = count + 1;
			}
		aScanner.close();
}
}
