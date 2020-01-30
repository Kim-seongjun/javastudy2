package service;

import java.util.Calendar;

public class ScoreOper {

	public int getAge(int year) {
		int cYear=Calendar.getInstance().get(Calendar.YEAR);
		
		return cYear-year;
	}

	public int getTotal(int java, int oracle, int web) {
		return java + oracle + web;
	}

	public double getAvg(int total, int i) {
		return total/i;
	}

	public String getGrade(int avg) {
		String grade="";
		int v10=avg/10;
		int v1=avg%10;
		if(v10>=9) grade="A";
		else if(v10>=8) grade="B";
		else if(v10>=7) grade="B";
		else if(v10>=6) grade="B";
		else grade="F";
		
		if(v10==10) grade+="+";
		else if(v1>=5) grade+="+";
		else grade+="0";
		
		
		return grade;
	}

}
