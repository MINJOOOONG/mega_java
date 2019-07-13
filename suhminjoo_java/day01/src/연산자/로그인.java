package 연산자;

public class 로그인 {

	public static void main(String[] args) {
		
		int id = 1000; //회원가입
		int pw = 1111;
		int input = 1000; //입력한 아이디
		int input2 = 1111;
		
		if (id == input && pw == input2) {
			System.out.println("로그인 OK");
		} else {
			System.out.println("로그인 FAIL");

		}
	}

}
