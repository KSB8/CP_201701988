import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int score;
		System.out.println("�л��� ������ �Է��Ͻÿ�.");
		score = aScanner.nextInt();
		while (score >= 0) {
			if (score > 100 ) {
				System.out.println("���� : 100�� �Ѵ� ������ �ԷµǾ����ϴ�.");
			}
			else {
			}
			System.out.println("�л��� ������ �Է��Ͻÿ�.");
			score = aScanner.nextInt();
			
		}
	}

}
