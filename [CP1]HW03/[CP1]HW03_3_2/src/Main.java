import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		
		int sum, count;
		int N;
		sum = 0;
		count = 1;
		System.out.println("1���� N���� �հ踦 ���Ϸ��� �մϴ�. N���� �Է��Ͻʽÿ�.");
		N = aScanner.nextInt();
		while (count <= N){
			sum = sum + count;
			System.out.println("1���� " + count +"������ ���� " + sum + "�Դϴ�." );
			count = count + 1;
			}
		aScanner.close();
}
}
