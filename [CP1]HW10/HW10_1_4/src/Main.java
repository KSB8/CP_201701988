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
		
		System.out.println("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�.");
		
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
				System.out.println("���� : 100�� �Ѿ, ��������  ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			else {
				System.out.println("[��  ��] ���� : "+aScoreKorean+" [��  ��] : "+gradeKorean+ " [��  ��] : "+pointKorean);
				System.out.println("[��  ��] ���� : "+aScoreEnglish+" [��  ��] : "+gradeEnglish+ " [��  ��] : "+pointEnglish);
				System.out.println("[��ǻ��] ���� : "+aScoreComputer+" [��  ��] : "+gradeComputer+ " [��  ��] : "+pointComputer);
				System.out.println(" �� �л��� ��� ������ "+gpa+" �Դϴ�.");
				gpacounter.count(gpa);
			}

			System.out.println("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�.");
			
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
		
		System.out.println(" ���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� ������ 3.0 �̻��� �л��� "+numberOfgpa3+"�Դϴ�.");
		System.out.println("��� ������ 2.0 �̻� 3.0 �̸��� �л��� "+numberOfgpa2+"�Դϴ�.");
		System.out.println("��� ������ 1.0 �̻� 2.0 �̸��� �л��� "+numberOfgpa1+"�Դϴ�.");
		System.out.println("��� ������ 0.0 �̻� 1.0 �̸��� �л��� "+numberOfgpa0+"�Դϴ�.");
		System.out.println(" ���α׷��� �����մϴ�.");

	}
	private static int inputScore() {
		return aScanner.nextInt();
	}

}
