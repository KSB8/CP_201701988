import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		
		int score=0;
		int numberOfstudents=0;
		int sumOfscores =0;
		double average;
		char grade;
		int anumber =0,  bnumber=0, cnumber=0, dnumber=0, fnumber =0;
		
		numberOfstudents = numberOfstudents + 1;
		sumOfscores = sumOfscores + score;
		
		System.out.println("학생의 성적을 입력하시오.");
		score = aScanner.nextInt();
		
		while (score >=0){
			if (score > 100) {
				System.out.println("오류 : 100이 넘는 성적이 입력되었습니다.");
				System.out.println("학생의 성적을 입력하시오.");
				score = aScanner.nextInt();
			}
			else {
				numberOfstudents = numberOfstudents + 1;
				sumOfscores = sumOfscores + score;
				if ((score>=90)&&(score<=100)) {
					grade = 'A';
					System.out.println("( 성적 : " + score + " 학점 : " + grade + ")");
					anumber ++;
				}
				else if ((score>=80)&&(score<90)) {
					grade = 'B';
					System.out.println("( 성적 : " + score + " 학점 : " + grade+")");
					bnumber ++;
				}
				else if ((score>=70)&&(score<80)) {
					grade = 'C';
					System.out.println("( 성적 : " + score + " 학점 : " + grade+")");
					cnumber ++;
				}
				else if ((score>=60)&&(score<70)) {
					grade = 'D';
					System.out.println("( 성적 : " + score + " 학점 : " + grade+")");
					dnumber ++;
				}
				else {
					grade = 'F';
					System.out.println("( 성적 : " + score + " 학점 : " + grade+")");
					fnumber ++;
				}
				System.out.println("학생의 성적을 입력하시오.");
				score = aScanner.nextInt(); 
			}
		} aScanner.close();
		average = (double)sumOfscores/(double)numberOfstudents;
		System.out.println("학생 수는 " + numberOfstudents + "입니다.");
		System.out.println("평균은 " + average + "입니다.");
		System.out.println("A학점은 " + anumber + "명 입니다.");
		System.out.println("B학점은 " + bnumber + "명 입니다.");
		System.out.println("C학점은 " + cnumber + "명 입니다.");
		System.out.println("D학점은 " + dnumber + "명 입니다.");
		System.out.println("F학점은 " + fnumber + "명 입니다.");
	}

}
