import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner aScanner = new Scanner(System.in);
		
		int n;
		
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�.>>");
		
		System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ�. :");
		n = aScanner.nextInt();
		while (0<=n) {
			printAsterisks(n);
			System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ�. :");
			n = aScanner.nextInt();
		}
		aScanner.close();
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�.>>");
	}
	private static void printAsterisks(int n) {
		int a = 0;
		while (a<n) {
			System.out.print("*");
			a++;
		}
		System.out.println();
	}
}