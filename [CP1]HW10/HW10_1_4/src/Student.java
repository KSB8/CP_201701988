public class Student {
	private int _scoreKorean;
	private int _scoreEnglish;
	private int _scoreComputer;
	
	private char score2Grade(int aScore) {
		if (aScore>=90) {
			return 'A';
		}
		else if ((aScore>=80)&&(aScore<90)) {
			return 'B';
		}
		else if ((aScore>=70)&&(aScore<80)) {
			return 'C';
		}
		else if ((aScore>=60)&&(aScore<70)) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	private double grade2Point(char aGrade) {
		if(aGrade == 'A') {
			return 4.0;
		}
		else if (aGrade =='B') {
			return 3.0;
		}
		else if (aGrade =='C') {
			return 2.0;
		}
		else if (aGrade =='D') {
			return 1.0;
		}
		else {
			return 0.0;
		}
	}
	public Student () {
		this._scoreKorean =0;
		this._scoreEnglish =0;
		this._scoreComputer =0;
	}
	public void setScoreKorean (int aScoreKorean) {
		this._scoreKorean = aScoreKorean;
	}
	public int scoreKorean() {
		return this._scoreKorean;
	}
	public char gradeKorean() {
		return this.score2Grade(this._scoreKorean);
	}
	public double pointKorean() {
		return this.grade2Point(this.score2Grade(this._scoreKorean));
	}
	public void setScoreEnglish (int aScoreEnglish) {
		this._scoreEnglish = aScoreEnglish;
	}
	public int scoreEnglish() {
		return this._scoreEnglish;
	}
	public char gradeEnglish() {
		return this.score2Grade(this._scoreEnglish);
	}
	public double pointEnglish() {
		return this.grade2Point(this.score2Grade(this._scoreEnglish));
	}
	public void setScoreComputer (int aScoreComputer) {
		this._scoreComputer = aScoreComputer;
	}
	public int scoreComputer() {
		return this._scoreComputer;
	}
	public char gradeComputer() {
		return this.score2Grade(this._scoreComputer);
	}
	public double pointComputer() {
		return this.grade2Point(this.score2Grade(this._scoreComputer));
	}
	public double gpa () {
		char scoreGradeKorean = score2Grade(_scoreKorean);
		char scoreGradeEnglish = score2Grade(_scoreEnglish);
		char scoreGradeComputer = score2Grade(_scoreComputer);
		double gradePointKorean = grade2Point(scoreGradeKorean);
		double gradePointEnglish = grade2Point(scoreGradeEnglish);
		double gradePointComputer = grade2Point(scoreGradeComputer);
		
		double gpa = (gradePointKorean+gradePointEnglish+gradePointComputer)/3.0;
		return gpa;
	}

}
