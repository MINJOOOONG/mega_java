package ���ǹ�;

import java.util.Scanner;

public class �԰��������2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�԰���� ���� ����2");
		System.out.println(" 1)�н� 2)�ѽ� 3)�Ͻ�");
		String menu = sc.next();
				
		switch(menu) {
		case "�н�":
			System.out.println("�н�������");
			break;
		case "�ѽ�":
			System.out.println("�ѽ�������");
			break;
		case "�Ͻ�":
			System.out.println("�Ͻ�������");
			break;
		default:
			System.out.println("������");
			break;
		}		

	}

}
