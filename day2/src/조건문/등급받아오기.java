package 조건문;

import java.util.Scanner;

public class 등급받아오기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력");
		int grade = sc.nextInt();
		
		switch (grade) {
		case 'a':
			System.out.println("최우수입니다.");
			break;
		case 'b':
			System.out.println("우수입니다.");
			break;
		case 'c':
			System.out.println("노력이 필요합니다.");
			break;
		default:
			System.out.println("통과하지 못하셨어요.");
			break;
		}
		
		
		
		
		
		

	}

}
