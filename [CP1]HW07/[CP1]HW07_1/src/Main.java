import java.util.Scanner;
public class Main {
	private static Scanner aScanner;
	public static void main(String[] args) {
		aScanner = new Scanner(System.in);
		int score;
		int aNumber=0, bNumber=0, cNumber=0, dNumber=0, fNumber=0;
		char grade;
		
		System.out.print("-������ �Է��Ͻÿ�. :");
		score = inputScore();
		while (score >=0) {
			if (score >100) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
				
			}
			else {
				grade = score2Grade(score); 
				System.out.println("���� : "+score+" ���� : "+grade);
				if (grade =='A') {
					aNumber++;
				}
				else if (grade == 'B') {
					bNumber++;
				}
				else if (grade == 'C') {
					cNumber++;
				}
				else if (grade == 'D') {
					dNumber++;
				}
				else {
					fNumber++;
				}
			}
			System.out.print("-������ �Է��Ͻÿ�. :");
			score = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("A�� "+aNumber+"�� �Դϴ�.");
		System.out.println("B�� "+bNumber+"�� �Դϴ�.");
		System.out.println("C�� "+cNumber+"�� �Դϴ�.");
		System.out.println("D�� "+dNumber+"�� �Դϴ�.");
		System.out.println("F�� "+fNumber+"�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}
	private static int inputScore() {
		aScanner = new Scanner(System.in);
		int n = aScanner.nextInt();
		return n;
		
	}
	private static char score2Grade(int aScore) {
		char aGrade;
		if ((90<=aScore)&&(aScore<=100)) {
			aGrade = 'A';
		}
		else if ((80<=aScore)&&(aScore<90)) {
			aGrade = 'B';
		}
		else if ((70<=aScore)&&(aScore<80)) {
			aGrade = 'C';
		}
		else if ((60<=aScore)&&(aScore<70)) {
			aGrade = 'D';
		}
		else {
			aGrade = 'F';
		}
		return aGrade;
	}

}
