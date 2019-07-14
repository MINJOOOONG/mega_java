package 조건문;

import java.util.Scanner;

public class 먹고싶은음식 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("먹고 싶은 음식 선택");
		System.out.println(" 1)짬뽕 2)짜장 3)우동");
		int food = sc.nextInt();
		
		switch(food) {
		case 1: 
			System.out.println("짬뽕을 먹으로 가요.");
			break;
		case 2:
			System.out.println("짜장을 먹으로 가요.");
			break;
		case 3:
			System.out.println("우동을 먹으로 가요.");
			break;
		default:
			System.out.println("안먹어요.");
			break;
		}
		
	}
}