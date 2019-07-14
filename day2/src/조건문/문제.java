package 조건문;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------------------");
		System.out.println("문제 1번 : 여러 조건 입력받기");
		System.out.println();
		
		System.out.print("오늘의 기온은?");
		int temp = sc.nextInt();
		
		System.out.print("오늘 나의 평가는?");
		String grade = sc.next();
		
		System.out.print("나의 신발 사이즈는?");
		double size = sc.nextDouble();
		
		System.out.println("오늘은" + temp + "도," + "오늘 나의 평가는" + grade + "," + "나의 신발 사이즈는  " + size + "입니다.");
		
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println();
		
		System.out.println("문제 2번 : 입력받은 숫자 비교");
		System.out.println();
		
		System.out.print("숫자 하나를 입력해주세요.");
		int a = sc.nextInt();
		System.out.print("또다른 숫자 하나를 입력해주세요.");
		int b = sc.nextInt();
		
		if (a == b) {
			System.out.println("두 수는 같습니다.");
		}
		else {
			System.out.println("두 수는 같지 않습니다.");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------");
		
		System.out.println("문제 3번 : 다음의 영수증을 출력하세요.");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		

	}

}
