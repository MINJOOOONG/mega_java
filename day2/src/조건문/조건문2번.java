package ���ǹ�;

import java.util.Date;

public class ���ǹ�2�� {

	public static void main(String[] args) {
		
		Date date = new Date();
		int hour = date.getHours(); //����ð�
		if (hour < 11) {
			System.out.println("�¸��~");
		}
		else if (hour < 18) {
			System.out.println("�� ������ ��~");
		}
		else if (hour <20) {
			System.out.println("�� �̺��~");
		}
		else {
			System.out.println("�³���~");
		}
	

	}

}
