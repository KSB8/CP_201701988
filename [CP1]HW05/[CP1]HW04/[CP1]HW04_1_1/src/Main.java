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
			System.out.println("이차방정식을 풀겠습니까?");
			System.out.println("풀려면 Y를 치시오.");
			userAnswer = ascanner.next().charAt(0);
		}
		
		System.out.println("이차방정식 풀이를 종료합니다.");
		ascanner.close();

	}
	
}
