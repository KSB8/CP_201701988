import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int n;
		
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다.>>");
		System.out.print("양의 정수 (종료하려면 음수)를 입력하시오 : ");
		n = inputNumber();
		
		while (0<=n) {
			printAsterisks(n);
			System.out.print("양의 정수 (종료하려면 음수)를 입력하시오 : ");
			n = inputNumber();
		}
		aScanner.close();
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 종료합니다.>>");
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

