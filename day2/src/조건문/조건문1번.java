package 조건문;

import java.util.Date;

public class 조건문1번 {

	public static void main(String[] args) {
		
		
		//↓자동 import라 부른다
		//컨트롤 + 쉬프트  + 영문 o (유틸로 저장이 안될때 이렇게 직접 해야함)
		
		
		
		Date date = new Date();
		int hour = date.getHours(); //현재시각
		
		if (hour <= 12) {
			System.out.println("오전입니다.");
		}
		else {
			System.out.println("오후입니다.");
		}
	

	}

}
