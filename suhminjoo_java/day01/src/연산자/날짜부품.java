package ������;

import java.util.Date;

public class ��¥��ǰ {

	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours() -12 ;
		int min = date.getMinutes();
		
		System.out.println("���� �ð��� " +  hour + "��" + min +  "�� �Դϴ�.");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDay() ;
		
		System.out.println("������ " + year + "��" + month + "��" + day + "���Դϴ�.");


	}

}
