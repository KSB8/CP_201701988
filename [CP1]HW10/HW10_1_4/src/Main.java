import java.util.Scanner;
public class Main {
	private static Scanner aScanner = new Scanner(System.in);
	public static void main(String[] args) {
		Student student = new Student ();
		GPACounter gpacounter = new GPACounter();
		int aScoreKorean;
		int aScoreEnglish;
		int aScoreComputer;
		char gradeKorean, gradeEnglish, gradeComputer;
		double pointKorean, pointEnglish, pointComputer;
		double gpa;
		int numberOfgpa3, numberOfgpa2, numberOfgpa1, numberOfgpa0;
		
		System.out.println("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다.");
		
		aScoreKorean = inputScore();
		student.setScoreKorean(aScoreKorean);
		aScoreEnglish = inputScore();
		student.setScoreEnglish(aScoreEnglish);
		aScoreComputer = inputScore();
		student.setScoreComputer(aScoreComputer);
		
		gradeKorean = student.gradeKorean();
		gradeEnglish = student.gradeEnglish();
		gradeComputer = student.gradeComputer();
		
		pointKorean = student.pointKorean();
		pointEnglish = student.pointEnglish();
		pointComputer = student.pointComputer();
		gpa = student.gpa();
	
		
		while ((aScoreKorean>=0)&&(aScoreEnglish>=0)&&(aScoreComputer>=0)) {
			if(aScoreKorean>100||aScoreEnglish>100||aScoreComputer>100) {
				System.out.println("오류 : 100이 넘어서, 정상적인  점수가 아닌 것이 있습니다.");
			}
			else {
				System.out.println("[국  어] 점수 : "+aScoreKorean+" [학  점] : "+gradeKorean+ " [평  점] : "+pointKorean);
				System.out.println("[영  어] 점수 : "+aScoreEnglish+" [학  점] : "+gradeEnglish+ " [평  점] : "+pointEnglish);
				System.out.println("[컴퓨터] 점수 : "+aScoreComputer+" [학  점] : "+gradeComputer+ " [평  점] : "+pointComputer);
				System.out.println(" 이 학생의 평균 평점은 "+gpa+" 입니다.");
				gpacounter.count(gpa);
			}

			System.out.println("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다.");
			
			aScoreKorean = inputScore();
			student.setScoreKorean(aScoreKorean);
			aScoreEnglish = inputScore();
			student.setScoreEnglish(aScoreEnglish);
			aScoreComputer = inputScore();
			student.setScoreComputer(aScoreComputer);
			
			gradeKorean = student.gradeKorean();
			gradeEnglish = student.gradeEnglish();
			gradeComputer = student.gradeComputer();
			
			pointKorean = student.pointKorean();
			pointEnglish = student.pointEnglish();
			pointComputer = student.pointComputer();
			gpa = student.gpa();
			
		}
		
		numberOfgpa3 = gpacounter.numberOfGPA3();
		numberOfgpa2 = gpacounter.numberOfGPA2();
		numberOfgpa1 = gpacounter.numberOfGPA1();
		numberOfgpa0 = gpacounter.numberOfGPA0();
		
		System.out.println(" 음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균 평점이 3.0 이상인 학생은 "+numberOfgpa3+"입니다.");
		System.out.println("평균 평점이 2.0 이상 3.0 미만인 학생은 "+numberOfgpa2+"입니다.");
		System.out.println("평균 평점이 1.0 이상 2.0 미만인 학생은 "+numberOfgpa1+"입니다.");
		System.out.println("평균 평점이 0.0 이상 1.0 미만인 학생은 "+numberOfgpa0+"입니다.");
		System.out.println(" 프로그램을 종료합니다.");

	}
	private static int inputScore() {
		return aScanner.nextInt();
	}

}
