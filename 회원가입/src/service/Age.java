package service;

import java.util.Calendar;

public class Age {

	public int getOperAge(String birth) {
		Calendar c=Calendar.getInstance();
		int curYear=c.get(c.YEAR);
		return curYear-Integer.parseInt(birth.substring(0,4))+1;
	}

}
