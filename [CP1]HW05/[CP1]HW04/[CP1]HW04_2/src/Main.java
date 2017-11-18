import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		char userAnswer;
		int N;
		System.out.println("factorial 계산을 하시겠습니까?");
		System.out.println("하시겠으면 Y를 입력하시오.");
		userAnswer = aScanner.next().charAt(0);
		while (userAnswer == 'Y' || userAnswer =='y') {
			System.out.println("N의 값을 입력하시오.");
			N = aScanner.nextInt();
			int fact = 1;
			int count = 2;
			if (N <0) {
				System.out.println("N의 값이 음수이므로, factorial 값을 계산할 수 없습니다.");
			}
			else {
				System.out.println(N + "factorial 값을 계산하려고 합니다.");
				if (N == 0) {
					fact = 1;
				}
				else {
					while (count <= N) {
						fact = fact*count;
						count = count + 1;
					}
				}
				System.out.println("factorial 값은" + fact + "입니다.");
			}
			System.out.println("factorial 계산을 하시겠습니까?");
			System.out.println("하시겠으면 Y를 입력하시오.");
			userAnswer = aScanner.next().charAt(0);
		}System.out.println("factorial 계산을 종료합니다.");
		aScanner.close();
	}

}
