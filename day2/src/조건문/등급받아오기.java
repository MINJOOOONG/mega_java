package ���ǹ�;

import java.util.Scanner;

public class ��޹޾ƿ��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int grade = sc.nextInt();
		
		switch (grade) {
		case 'a':
			System.out.println("�ֿ���Դϴ�.");
			break;
		case 'b':
			System.out.println("����Դϴ�.");
			break;
		case 'c':
			System.out.println("����� �ʿ��մϴ�.");
			break;
		default:
			System.out.println("������� ���ϼ̾��.");
			break;
		}
		
		
		
		
		
		

	}

}
