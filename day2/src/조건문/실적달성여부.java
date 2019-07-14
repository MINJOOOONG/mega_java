package 조건문;

import java.util.Scanner;

public class 실적달성여부 {

	public static void main(String[] args) {
		
		
		/*실적 목표 : 1000
		 * 입력값 : 1200
		 * 축하!!! 실적 달성
		 * 안타깝네요!! 실적 미달성
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘의 실적을 입력해주세용 : " );
		int data = sc.nextInt();
		
		if (data >= 1000) {
			System.out.println("축하!! 실적 달성");
			double bonus = data * 0.2;
			System.out.println("당신의 보너스는" + (int) bonus + "만원 입니다.");
		}
		else {
			System.out.println("안타깝네요!! 실적 미달성");
		}
		

	}

}
