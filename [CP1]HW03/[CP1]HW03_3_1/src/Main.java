import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		
		Double a, b, c;
		Double determinant;
		Double x1, x2;
		System.out.println("a���� �Է��Ͻÿ�.");
		a = aScanner.nextDouble();
		System.out.println("b���� �Է��Ͻÿ�.");
		b = aScanner.nextDouble();
		System.out.println("c���� �Է��Ͻÿ�.");
		c = aScanner.nextDouble();
		
		if ((-0.0000001 < a)&&(a < 0.0000001)){
			System.out.println("�������� ����� 0���� ������������ Ǯ �� �����ϴ�.");
		}
		else {
			determinant = b*b - 4*a*c;
			if (determinant < 0){
				System.out.println("�Ǻ����� ���� 0���� �۾� �Ǳ��� ���� �� �����ϴ�.");
			}
			else {
				x1 = (-b + Math.sqrt(determinant))/2*a;
				x2 = (-b - Math.sqrt(determinant))/2*a;
				System.out.println("������������ �ش�" + x1 + " �Ǵ� " + x2 + "�Դϴ�.");
			}
			aScanner.close();
		}
	}

}