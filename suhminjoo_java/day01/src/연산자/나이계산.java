package 연산자;

import java.util.Date;

public class 나이계산 {

	public static void main(String[] args) {
		
		int year = 1999;
		
		Date date = new Date();
		int thisYear = date.getYear();
		
		int age = thisYear - year  + 1900 + 1;
		
		System.out.println("나의 나이는" + age + "이다. ");

	}

}
