import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		char userAnswer;
		int N;
		System.out.println("factorial ����� �Ͻðڽ��ϱ�?");
		System.out.println("�Ͻð����� Y�� �Է��Ͻÿ�.");
		userAnswer = aScanner.next().charAt(0);
		while (userAnswer == 'Y' || userAnswer =='y') {
			System.out.println("N�� ���� �Է��Ͻÿ�.");
			N = aScanner.nextInt();
			int fact = 1;
			int count = 2;
			if (N <0) {
				System.out.println("N�� ���� �����̹Ƿ�, factorial ���� ����� �� �����ϴ�.");
			}
			else {
				System.out.println(N + "factorial ���� ����Ϸ��� �մϴ�.");
				if (N == 0) {
					fact = 1;
				}
				else {
					while (count <= N) {
						fact = fact*count;
						count = count + 1;
					}
				}
				System.out.println("factorial ����" + fact + "�Դϴ�.");
			}
			System.out.println("factorial ����� �Ͻðڽ��ϱ�?");
			System.out.println("�Ͻð����� Y�� �Է��Ͻÿ�.");
			userAnswer = aScanner.next().charAt(0);
		}System.out.println("factorial ����� �����մϴ�.");
		aScanner.close();
	}

}
