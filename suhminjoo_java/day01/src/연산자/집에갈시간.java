
package ������;

import java.util.Date;

public class �������ð� {
	
	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours() - 12 ;
		System.out.println("���� �ð��� " + hour +"���̴�.");
		
		
		//�񱳿������� ����� boolean
		// true or false
		if(hour < 16) { //true
			System.out.println("���� �� �ð��� �� �����ֱ���.");
		}else { //false
			System.out.println("���� �� �ð��� ���� �� �Ǿ�����.");
		}

	}

}
