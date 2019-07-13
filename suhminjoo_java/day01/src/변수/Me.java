package 변수;
/*
 * 작성자 : 서민주
 * 날짜 : 2019.07.13
 * 수정내용 :
 */






public class Me {

	public static void main(String[] args) {
		
		byte age; //선언 → 메모리 공간 확보
		age = 21; //= →  할당연산자, 대입연산자
		
		int money = 100;
		
		double weight = 48;
		float eye = 1.0f;
		
		char gender = '여';
		
		String name = "서민주";
		
		boolean lunch = true; //false
		
		//+ : 결합연산자
		
		
		System.out.println("내 이름은" + name +"야.");
		System.out.println("난" + age + "살이야.");
		System.out.println("내 돈은 " + money + "억만큼 있어.");
		System.out.println("내 몸무게는" + weight + "kg이야.");
		System.out.println("내 시력은" +  eye + "이야.");
		System.out.println("내 성별은 " + gender + "야.");
		System.out.println("점심은 맛있게 드셨나요 : " + lunch  );

	}

}
