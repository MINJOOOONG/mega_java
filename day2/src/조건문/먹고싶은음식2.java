package 조건문;

import java.util.Scanner;

public class 먹고싶은음식2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("먹고싶은 음식 선택2");
		System.out.println(" 1)분식 2)한식 3)일식");
		String menu = sc.next();
				
		switch(menu) {
		case "분식":
			System.out.println("분식집으로");
			break;
		case "한식":
			System.out.println("한식집으로");
			break;
		case "일식":
			System.out.println("일식집으로");
			break;
		default:
			System.out.println("집에서");
			break;
		}		

	}

}
