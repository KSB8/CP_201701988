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
		
		System.out.println("�л��� ������ �Է��Ͻÿ�.");
		score = aScanner.nextInt();
		
		while (score >=0){
			if (score > 100) {
				System.out.println("���� : 100�� �Ѵ� ������ �ԷµǾ����ϴ�.");
				System.out.println("�л��� ������ �Է��Ͻÿ�.");
				score = aScanner.nextInt();
			}
			else {
				numberOfstudents = numberOfstudents + 1;
				sumOfscores = sumOfscores + score;
				if ((score>=90)&&(score<=100)) {
					grade = 'A';
					System.out.println("( ���� : " + score + " ���� : " + grade + ")");
					anumber ++;
				}
				else if ((score>=80)&&(score<90)) {
					grade = 'B';
					System.out.println("( ���� : " + score + " ���� : " + grade+")");
					bnumber ++;
				}
				else if ((score>=70)&&(score<80)) {
					grade = 'C';
					System.out.println("( ���� : " + score + " ���� : " + grade+")");
					cnumber ++;
				}
				else if ((score>=60)&&(score<70)) {
					grade = 'D';
					System.out.println("( ���� : " + score + " ���� : " + grade+")");
					dnumber ++;
				}
				else {
					grade = 'F';
					System.out.println("( ���� : " + score + " ���� : " + grade+")");
					fnumber ++;
				}
				System.out.println("�л��� ������ �Է��Ͻÿ�.");
				score = aScanner.nextInt(); 
			}
		} aScanner.close();
		average = (double)sumOfscores/(double)numberOfstudents;
		System.out.println("�л� ���� " + numberOfstudents + "�Դϴ�.");
		System.out.println("����� " + average + "�Դϴ�.");
		System.out.println("A������ " + anumber + "�� �Դϴ�.");
		System.out.println("B������ " + bnumber + "�� �Դϴ�.");
		System.out.println("C������ " + cnumber + "�� �Դϴ�.");
		System.out.println("D������ " + dnumber + "�� �Դϴ�.");
		System.out.println("F������ " + fnumber + "�� �Դϴ�.");
	}

}
