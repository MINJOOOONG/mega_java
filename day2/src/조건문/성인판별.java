package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 성인판별 {

	public static void main(String[] args) {
		
		System.out.println("태어난 해 입력 >>");
		
		Scanner sc = new Scanner(System.in);
		int year = sc. nextInt();
		
		Date date = new Date();
		int thisYear = date.getYear() + 1900;
		
		int age = thisYear - year + 1;
		System.out.println("당신의 나이는 "+ age + " 살입니다.");
		
		
		if (age >= 18) { //true
			System.out.println("당신은 성인입니다!");
		}
		else { //false
			System.out.println("당신은 미성년입니다!");
		}

	}

}
