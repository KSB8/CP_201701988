
import java.util.Scanner;
public class Main { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascanner = new Scanner (System.in);
		char userAnswer;
		
		System.out.println("이차방정식을 풀겠습니까?");
		System.out.println("풀려면 Y를 치시오.");
		userAnswer = ascanner.next().charAt(0);
		
		while (userAnswer == 'Y' || userAnswer == 'y') {
			double a, b, c;
			System.out.println("이차항의 계수 a의 값을 입력하시오");
			a = ascanner.nextDouble();
			System.out.println("일차항의 계수 b의 값을 입력하시오");
			b = ascanner.nextDouble();
			System.out.println("상수항의 계수 c의 값을 입력하시오");
			c = ascanner.nextDouble();
			if ((-0.0000001 < a)&&(a < 0.0000001)) {
				System.out.println("이차항의 계수가 0이므로 이차방정식 풀이를 종료합니다.");
			}
			else {
				double determinant;
				determinant = b*b -4*a*c;
				if (determinant < 0) {
					System.out.println("판별식의 값이 0보다 작아 실근을 구할 수 없습니다.");
				}
				else {
					double x1, x2;
					x1 = (-b + Math.sqrt(determinant))/(2*a);
					x2 = (-b - Math.sqrt(determinant))/(2*a);
					System.out.println("이차방정식의 해는" + x1 +"또는" + x2 + "입니다");
				}
			}System.out.println("이차방정식을 풀겠습니까?");
			System.out.println("풀려면 Y를 치시오.");
			userAnswer = ascanner.next().charAt(0);
		}
		
		System.out.println("이차방정식 풀이를 종료합니다.");
		ascanner.close();

	}
	
}
