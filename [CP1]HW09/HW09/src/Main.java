import java.util.Scanner;
public class Main {
	private static Scanner aScanner = new Scanner(System.in);
	private static final int MAX_SIZE = 100;
	public static void main(String[] args) {
		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents =0;
		double classAverage;
		score = inputScore();
		while (score >=0){
			if (score > 100) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores[numberOfStudents]=score;
				numberOfStudents ++;
			}
			score = inputScore();
		}
		classAverage = calcAverage(scores, numberOfStudents);
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println("�����"+classAverage+"�Դϴ�.");
		
		int aboveClassAverage =0;
		int count =0;
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		while(count< numberOfStudents){
			if ((double)scores[count]>= classAverage) {
				System.out.println("["+count+"]"+scores[count]+"(��� �̻��Դϴ�)");
				aboveClassAverage++;
			}
			else {
				System.out.println("["+count+"]"+scores[count]+"(��� �̸��Դϴ�)");
			}
			count++;
		}
		System.out.println("��� �̻��� �л��� ���� "+aboveClassAverage+" �� �Դϴ�.");
		System.out.println();
		System.out.println("�ְ�����"+calcMax(scores, numberOfStudents)+"�� �Դϴ�.");
		System.out.println("��������"+calcMin(scores, numberOfStudents)+"�� �Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}
	private static int inputScore() {
		int n;
		System.out.print("> ������ �Է��Ͻÿ�. : ");
		n = aScanner.nextInt();
		return n;
	}
	private static double calcAverage(int[] elements, int aSize){
		int i;
		int sum;
		double average;
		i =0;
		sum =0;
		while (i < aSize) {
			sum = sum+elements[i];
			i++;
		}
		average = (double)sum/(double)aSize;
		return average;
	}
	private static double calcMax(int[] elements, int aSize){
		int i, max;
		max = elements[0];
		i =1;
		while (i<aSize){
			if(max< elements[i]){
				max = elements[i];
			}
			i++;
		}
		return max;
	}
	private static double calcMin(int[] elements, int aSize){
		int i, min;
		min = elements[0];
		i =1;
		while (i<aSize){
			if(min> elements[i]){
				min = elements[i];
			}
			i++;
		}
		return min;
	}

}