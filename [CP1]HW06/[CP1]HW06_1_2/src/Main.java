import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int n;
		
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�.>>");
		System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ� : ");
		n = inputNumber();
		
		while (0<=n) {
			printAsterisks(n);
			System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ� : ");
			n = inputNumber();
		}
		aScanner.close();
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�.>>");
	}
	private static void printAsterisks(int n) {
		int a =0;
		while (a<n) {
			System.out.print("*");
			a++;
		}
		System.out.println();
	}
	private static int inputNumber() {
		Scanner aScanner = new Scanner(System.in);
		int n;
		n = aScanner.nextInt();
		return n;	
	}
}

