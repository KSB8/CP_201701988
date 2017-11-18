import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int score;
		int numberOfstudents;
		int sumOfscores;
		double average;
		
		numberOfstudents = 0;
		sumOfscores = 0;
		
		System.out.println("학생의 성적을 입력하시오.");
		score = aScanner.nextInt();
		
		while (score >= 0) {
			if (score > 100 ) {
				System.out.println("오류 : 100이 넘는 성적이 입력되었습니다.");
				System.out.println("학생의 성적을 입력하시오.");
				score = aScanner.nextInt();
			}
			else {
				numberOfstudents = numberOfstudents + 1;
				sumOfscores = sumOfscores + score;
				System.out.println("학생의 성적을 입력하시오.");
				score = aScanner.nextInt();
			}	
		}aScanner.close();
		average = (double)sumOfscores/(double)numberOfstudents;
		System.out.println("학생 수는 "+numberOfstudents + "입니다.");
		System.out.println("평균은 " + average +" 입니다.");
			
		}
	}


	


