
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
			double a, b, c;
			System.out.println("�������� ��� a�� ���� �Է��Ͻÿ�");
			a = ascanner.nextDouble();
			System.out.println("�������� ��� b�� ���� �Է��Ͻÿ�");
			b = ascanner.nextDouble();
			System.out.println("������� ��� c�� ���� �Է��Ͻÿ�");
			c = ascanner.nextDouble();
			if ((-0.0000001 < a)&&(a < 0.0000001)) {
				System.out.println("�������� ����� 0�̹Ƿ� ���������� Ǯ�̸� �����մϴ�.");
			}
			else {
				double determinant;
				determinant = b*b -4*a*c;
				if (determinant < 0) {
					System.out.println("�Ǻ����� ���� 0���� �۾� �Ǳ��� ���� �� �����ϴ�.");
				}
				else {
					double x1, x2;
					x1 = (-b + Math.sqrt(determinant))/(2*a);
					x2 = (-b - Math.sqrt(determinant))/(2*a);
					System.out.println("������������ �ش�" + x1 +"�Ǵ�" + x2 + "�Դϴ�");
				}
			}System.out.println("������������ Ǯ�ڽ��ϱ�?");
			System.out.println("Ǯ���� Y�� ġ�ÿ�.");
			userAnswer = ascanner.next().charAt(0);
		}
		
		System.out.println("���������� Ǯ�̸� �����մϴ�.");
		ascanner.close();

	}
	
}
