package ���ǹ�;

import java.util.Scanner;

public class �����޼����� {

	public static void main(String[] args) {
		
		
		/*���� ��ǥ : 1000
		 * �Է°� : 1200
		 * ����!!! ���� �޼�
		 * ��Ÿ���׿�!! ���� �̴޼�
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է����ּ��� : " );
		int data = sc.nextInt();
		
		if (data >= 1000) {
			System.out.println("����!! ���� �޼�");
			double bonus = data * 0.2;
			System.out.println("����� ���ʽ���" + (int) bonus + "���� �Դϴ�.");
		}
		else {
			System.out.println("��Ÿ���׿�!! ���� �̴޼�");
		}
		

	}

}
