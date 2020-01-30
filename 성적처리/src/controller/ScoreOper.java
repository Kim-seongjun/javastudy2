package controller;

public class ScoreOper {

	public int getAge(int year) {
		
		return 2019-year+1;
	}

	public int getTotal(int java, int oracle, int web) {
		return java + oracle + web;
		
	}

	public double getAvg(int total, int i) {
		return (double)total/i;
		
	}

	public String getGrade(int avg) {
		String grade = "";
			int v10 = avg/10; //십의 자리 점수 0,~9,10
			int v1 = avg%10; //일의 자리 점수 0~4(0) 5~9(+)
			if(v10 >= 9) grade = "A";
			else if (v10 >= 8) grade = "B";
			else if (v10 >= 7) grade = "C";
			else if (v10 >= 6) grade = "D";
			else grade = "F";
			
			if(v10 == 10) grade += "+";
			else if(v1>=5) grade = "+";
			else grade += "0";
			return grade;
	}

}
