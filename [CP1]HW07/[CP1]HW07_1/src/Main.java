import java.util.Scanner;
public class Main {
	private static Scanner aScanner;
	public static void main(String[] args) {
		aScanner = new Scanner(System.in);
		int score;
		int aNumber=0, bNumber=0, cNumber=0, dNumber=0, fNumber=0;
		char grade;
		
		System.out.print("-점수를 입력하시오. :");
		score = inputScore();
		while (score >=0) {
			if (score >100) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
				
			}
			else {
				grade = score2Grade(score); 
				System.out.println("점수 : "+score+" 학점 : "+grade);
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
			System.out.print("-점수를 입력하시오. :");
			score = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("A는 "+aNumber+"명 입니다.");
		System.out.println("B는 "+bNumber+"명 입니다.");
		System.out.println("C는 "+cNumber+"명 입니다.");
		System.out.println("D는 "+dNumber+"명 입니다.");
		System.out.println("F는 "+fNumber+"명 입니다.");
		System.out.println("프로그램을 종료합니다.");
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
