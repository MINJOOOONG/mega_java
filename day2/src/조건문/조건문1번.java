package ���ǹ�;

import java.util.Date;

public class ���ǹ�1�� {

	public static void main(String[] args) {
		
		
		//���ڵ� import�� �θ���
		//��Ʈ�� + ����Ʈ  + ���� o (��ƿ�� ������ �ȵɶ� �̷��� ���� �ؾ���)
		
		
		
		Date date = new Date();
		int hour = date.getHours(); //����ð�
		
		if (hour <= 12) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
	

	}

}
