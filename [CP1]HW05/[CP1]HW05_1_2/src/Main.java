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
		
		System.out.println("�л��� ������ �Է��Ͻÿ�.");
		score = aScanner.nextInt();
		
		while (score >= 0) {
			if (score > 100 ) {
				System.out.println("���� : 100�� �Ѵ� ������ �ԷµǾ����ϴ�.");
				System.out.println("�л��� ������ �Է��Ͻÿ�.");
				score = aScanner.nextInt();
			}
			else {
				numberOfstudents = numberOfstudents + 1;
				sumOfscores = sumOfscores + score;
				System.out.println("�л��� ������ �Է��Ͻÿ�.");
				score = aScanner.nextInt();
			}	
		}aScanner.close();
		average = (double)sumOfscores/(double)numberOfstudents;
		System.out.println("�л� ���� "+numberOfstudents + "�Դϴ�.");
		System.out.println("����� " + average +" �Դϴ�.");
			
		}
	}


	


