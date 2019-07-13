package 연산자;

import java.util.Date;

public class 날짜부품 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours() -12 ;
		int min = date.getMinutes();
		
		System.out.println("현재 시간은 " +  hour + "시" + min +  "분 입니다.");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDay() ;
		
		System.out.println("오늘은 " + year + "년" + month + "월" + day + "일입니다.");


	}

}
