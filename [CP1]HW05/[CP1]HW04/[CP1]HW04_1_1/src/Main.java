import java.util.Scanner;
public class Main { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascanner = new Scanner (System.in);
		char userAnswer;
		
		System.out.println("������������ Ǯ�ڽ��ϱ�?");
		System.out.println("Ǯ���� Y�� ġ�ÿ�.");
		userAnswer = ascanner.next().charAt(0);
		
		while (userAnswer == 'Y' || userAnswer == 'y') {
			System.out.println("������������ Ǯ�ڽ��ϱ�?");
			System.out.println("Ǯ���� Y�� ġ�ÿ�.");
			userAnswer = ascanner.next().charAt(0);
		}
		
		System.out.println("���������� Ǯ�̸� �����մϴ�.");
		ascanner.close();

	}
	
}
