package ������;

import java.util.Date;

public class ���̰�� {

	public static void main(String[] args) {
		
		int year = 1999;
		
		Date date = new Date();
		int thisYear = date.getYear();
		
		int age = thisYear - year  + 1900 + 1;
		
		System.out.println("���� ���̴�" + age + "�̴�. ");

	}

}
