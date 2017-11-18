import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		
		Double a, b, c;
		Double determinant;
		Double x1, x2;
		System.out.println("a값을 입력하시오.");
		a = aScanner.nextDouble();
		System.out.println("b값을 입력하시오.");
		b = aScanner.nextDouble();
		System.out.println("c값을 입력하시오.");
		c = aScanner.nextDouble();
		
		if ((-0.0000001 < a)&&(a < 0.0000001)){
			System.out.println("이차항의 계수가 0으로 이차방정식을 풀 수 없습니다.");
		}
		else {
			determinant = b*b - 4*a*c;
			if (determinant < 0){
				System.out.println("판별식의 값이 0보다 작아 실근을 구할 수 없습니다.");
			}
			else {
				x1 = (-b + Math.sqrt(determinant))/2*a;
				x2 = (-b - Math.sqrt(determinant))/2*a;
				System.out.println("이차방정식의 해는" + x1 + " 또는 " + x2 + "입니다.");
			}
			aScanner.close();
		}
	}

}